package com.novel.repository.impl;

import com.novel.eneity.NovelContent;
import com.novel.repository.ContentRepository;
import com.novel.utils.JdbcTools;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ContentRepositoryImpl implements ContentRepository {
    List<NovelContent> list=new ArrayList<>();;

    @Override
    public List<NovelContent> findAllContent() {
        Connection connection= JdbcTools.getConnection();
        PreparedStatement statement=null;
        ResultSet resultSet=null;
        String sql="SELECT * FROM zhangjie";

        try {
            statement=connection.prepareStatement(sql);

            resultSet=statement.executeQuery();

            while (resultSet.next()){
                list.add(new NovelContent(resultSet.getString(1),resultSet.getString(2),resultSet.getString(3),resultSet.getString(4)));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            JdbcTools.release(connection,statement,resultSet);
        }
        return list;
    }

    @Override
    public List<NovelContent> findContentByBook(String bookid) {
        //        获取连接对象
        Connection connection= JdbcTools.getConnection();
        //        运行数据库语句的对象
        PreparedStatement statement=null;
        //        保存结果集的对象
        ResultSet resultSet =null;
        String sql="SELECT * from zhangjie \n" +
                "WHERE  xiaoshuoid=? \n";

        try {
            statement=connection.prepareStatement(sql);

            statement.setString(1,bookid);

            resultSet=statement.executeQuery();

            while (resultSet.next()){
                list.add(new NovelContent(resultSet.getString(1),resultSet.getString(2),resultSet.getString(3),resultSet.getString(4)));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            JdbcTools.release(connection,statement,resultSet);
        }
        return list;
    }
}
