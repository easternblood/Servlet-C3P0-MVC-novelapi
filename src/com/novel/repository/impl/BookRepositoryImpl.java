package com.novel.repository.impl;

import com.novel.eneity.NovelInfo;
import com.novel.repository.BookRepository;
import com.novel.utils.JdbcTools;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class BookRepositoryImpl implements BookRepository {

    List<NovelInfo> list=new ArrayList<>();

    @Override
    public List<NovelInfo> findAllBook() {
        //        获取连接对象
        Connection connection= JdbcTools.getConnection();
        //        运行数据库语句的对象
        PreparedStatement statement=null;
        //        保存结果集的对象
        ResultSet resultSet =null;
//        需要执行的sql语句
        String sql="SELECT * FROM xiaoshuoinfo";
        try {
            statement=connection.prepareStatement(sql);

            resultSet=statement.executeQuery();

            while (resultSet.next()){
                list.add(new NovelInfo(resultSet.getString(1),resultSet.getString(2),resultSet.getString(3),resultSet.getString(4)));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            JdbcTools.release(connection,statement,resultSet);
        }

        return list;
    }

    @Override
    public NovelInfo findBookById(String id) {
        //        获取连接对象
        Connection connection= JdbcTools.getConnection();
        //        运行数据库语句的对象
        PreparedStatement statement=null;
        //        保存结果集的对象
        ResultSet resultSet =null;
        NovelInfo novelInfo=null;
//        需要执行的sql语句
        String sql="SELECT * FROM xiaoshuoinfo where xiaoshuoid=?";
        try {
            statement=connection.prepareStatement(sql);

            //参数代替问号
            statement.setString(1,id);

            resultSet=statement.executeQuery();

            if(resultSet.next()){
               novelInfo=new NovelInfo(resultSet.getString(1),resultSet.getString(2),resultSet.getString(3),resultSet.getString(4));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            JdbcTools.release(connection,statement,resultSet);
        }
        return novelInfo;
    }

    @Override
    public List<NovelInfo> findBookByKind(String kindid) {
        //        获取连接对象
        Connection connection= JdbcTools.getConnection();
        //        运行数据库语句的对象
        PreparedStatement statement=null;
        //        保存结果集的对象
        ResultSet resultSet =null;
        //        需要执行的sql语句
        String sql="SELECT * from xiaoshuoinfo,xiaoshuofenlei \n" +
                "WHERE xiaoshuofenlei.xiaoshuofenleiid=xiaoshuoinfo.xiaoshuofenleiid \n" +
                "AND xiaoshuoinfo.xiaoshuofenleiid=1";
        try {
            statement=connection.prepareStatement(sql);

            resultSet=statement.executeQuery();

            while (resultSet.next()){
                list.add(new NovelInfo(resultSet.getString(1),resultSet.getString(2),resultSet.getString(3),resultSet.getString(4)));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            JdbcTools.release(connection,statement,resultSet);
        }

        return list;

    }
}
