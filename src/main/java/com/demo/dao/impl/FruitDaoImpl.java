package com.demo.dao.impl;

import com.demo.dao.FruitDao;
import com.demo.entity.Fruit;
import com.demo.utils.Db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class FruitDaoImpl implements FruitDao {
    @Override
    public void add(Fruit fruit) throws SQLException {
        Connection connection = Db.getConnection();
        String sql = "INSERT INTO db_test.db_fruit(name, kind, time) VALUES (?,?,?)";
        PreparedStatement pre = null;
        if (connection != null) {
            pre=connection.prepareStatement(sql);
            pre.setString(1,fruit.getName());
            pre.setString(2,fruit.getKind());
            pre.setDate(3,fruit.getTime());
            pre.executeUpdate();
            System.out.println("存储成功");
        }
        Db.close(null,pre,connection);
    }

    @Override
    public void delete(int id) throws SQLException {
        Connection connection = Db.getConnection();
        String sql = "DELETE FROM db_test.db_fruit WHERE id=?";
        PreparedStatement pre = null;
        if (connection != null) {
            pre=connection.prepareStatement(sql);
            pre.setInt(1,id);
            pre.executeUpdate();
            System.out.println("删除成功");
        }
        Db.close(null,pre,connection);
    }

    @Override
    public void update(Fruit fruit) throws SQLException {
        Connection connection = Db.getConnection();
        String sql = "UPDATE db_test.db_fruit SET name=?,kind=?,time=? WHERE id =?";
        PreparedStatement pre = null;
        if (connection != null) {
            pre=connection.prepareStatement(sql);
            pre.setString(1,fruit.getName());
            pre.setString(2,fruit.getKind());
            pre.setDate(3,fruit.getTime());
            pre.setInt(4,fruit.getId());
            pre.executeUpdate();
            System.out.println("修改成功");
        }
        Db.close(null,pre,connection);
    }

    @Override
    public Fruit findById(int id)throws SQLException {
        Fruit fruit = null;
        Connection connection = Db.getConnection();
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        String sql = "SELECT * FROM db_test.db_fruit WHERE id=?";
        if (connection != null) {
            statement = connection.prepareStatement(sql);
            statement.setInt(1,id);
            resultSet = statement.executeQuery();
            while (resultSet.next()) {
                fruit = new Fruit(
                        resultSet.getInt("id"),
                        resultSet.getString("name"),
                        resultSet.getString("kind"),
                        resultSet.getDate("time")
                );
            }
        }
        Db.close(resultSet,statement,connection);
        return fruit;
    }

    @Override
    public List<Fruit> findAll() throws SQLException {
        List<Fruit> fruits = new ArrayList<>();
        Connection connection = Db.getConnection();
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        String sql = "SELECT * FROM db_test.db_fruit";
        if (connection != null) {
            statement = connection.prepareStatement(sql);
            resultSet = statement.executeQuery();
            while (resultSet.next()) {
                Fruit fruit = new Fruit(
                        resultSet.getInt("id"),
                        resultSet.getString("name"),
                        resultSet.getString("kind"),
                        resultSet.getDate("time")
                );
                fruits.add(fruit);
            }
        }
        Db.close(resultSet,statement,connection);
        return fruits;
    }


}
