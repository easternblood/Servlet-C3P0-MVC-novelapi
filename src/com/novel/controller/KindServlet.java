package com.novel.controller;

import com.google.gson.Gson;
import com.novel.eneity.NovelInfo;
import com.novel.eneity.NovelKind;
import com.novel.service.KindService;
import com.novel.service.impl.KindServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/kind")
public class KindServlet extends HttpServlet {
    private KindService kindService=new KindServiceImpl();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //获取当前book路由下的方法
        String method = req.getParameter("method");
        System.out.println("KindServlet中使用方法为：" + method);
        Gson gson = new Gson();
        String json="";
        List<NovelKind> list=new ArrayList<>();
        //如果为空默认使用findAll方法
        if (method == null) {
            method = "findAllKind";
        }
        switch (method){
            case "findAllKind":
                list=kindService.findAllKind();
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

    }
}
