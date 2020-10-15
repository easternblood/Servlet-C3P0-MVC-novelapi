package com.novel.controller;

import com.google.gson.Gson;
import com.novel.eneity.NovelInfo;
import com.novel.service.BookService;
import com.novel.service.impl.BookServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/book")
public class BookServlet extends HttpServlet {
    private BookService bookService=new BookServiceImpl();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //获取当前book路由下的方法
        String method = req.getParameter("method");
        System.out.println("BookServlet中使用方法为：" + method);
        Gson gson = new Gson();
        String json="";
        List<NovelInfo> list=new ArrayList<>();
        //如果为空默认使用findAll方法
        if (method == null) {
            method = "findAllBook";
        }
        switch(method){
            case "findAllBook":
                list=bookService.findAllBook();
                json = gson.toJson(list);
                break;
            case "findBookById":
                String id = req.getParameter("id");
                NovelInfo novelInfo=bookService.findBookById(id);
                System.out.println("书为"+novelInfo);
                json=gson.toJson(novelInfo);
                break;
            case "findBookByKind":
                String kindid = req.getParameter("kindid");
                list=bookService.findBookByKind(kindid);
                json = gson.toJson(list);
                break;
        }
        resp.setContentType("text/plain");
        resp.setCharacterEncoding("gb2312");
        PrintWriter out = new PrintWriter(resp.getOutputStream());
        out.print(json);
        out.flush();//把内存中的数据刷写到硬盘
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

//        super.doPost(req, resp);
    }
}
