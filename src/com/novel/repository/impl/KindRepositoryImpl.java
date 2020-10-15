package com.novel.repository.impl;

import com.novel.eneity.NovelContent;
import com.novel.eneity.NovelKind;
import com.novel.repository.KindRepository;
import com.novel.utils.JdbcTools;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class KindRepositoryImpl implements KindRepository {
    @Override
    public List<NovelKind> findAllKind() {
        List<NovelKind> list = new ArrayList<>();;
        Connection connection = JdbcTools.getConnection();
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        String sql = "SELECT * FROM xiaoshuofenlei";

        try {
            statement = connection.prepareStatement(sql);

            resultSet = statement.executeQuery();

            while (resultSet.next()) {
                list.add(new NovelKind(resultSet.getInt(1), resultSet.getString(2)));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JdbcTools.release(connection, statement, resultSet);
        }
        return list;
    }
}
