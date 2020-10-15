package com.novel.controller;

import com.google.gson.Gson;
import com.novel.eneity.NovelContent;
import com.novel.eneity.NovelInfo;
import com.novel.service.ContentService;
import com.novel.service.impl.ContentServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/content")
public class ContentServlet extends HttpServlet {
    private ContentService contentService=new ContentServiceImpl();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        super.doGet(req, resp);
        //获取当前book路由下的方法
        String method = req.getParameter("method");
        System.out.println("ContentServlet中使用方法为：" + method);
        Gson gson = new Gson();
        String json="";
        List<NovelContent> list=new ArrayList<>();
        //如果为空默认使用findAll方法
        if (method == null) {
            method = "findAllContent";
        }
        switch (method){
            case "findContentByBook":
//                根据一本书的id
                String bookid = req.getParameter("bookid");
                list=contentService.findContentByBook(bookid);
                json = gson.toJson(list);
                break;
            case "findAllContent":
                list=contentService.findAllContent();
                json = gson.toJson(list);
                break;
        }
//        返回一本书的内容
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