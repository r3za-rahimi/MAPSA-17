package com.mapsa.jdbc.service;

import com.mapsa.jdbc.model.Person;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DAO {

    Connection connection;

    public DAO() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/tst", "root", "1234");
    }

    public void select() throws SQLException {

        PreparedStatement preparedStatement = connection.prepareStatement("Select * from person");
        ResultSet result = preparedStatement.executeQuery();

        while (result.next()) {

            System.out.println(result.getString("firstName"));

        }

    }


    public void insert(Person x) throws SQLException {

        PreparedStatement preparedStatement = connection.prepareStatement("insert into person " +
                "(id , firstname , lastname ,age , gender , geography , email , profession , salary , isAlive  ) " +
                " VALUES (?,?,?,?,?,?,?,?,?,?)");

        preparedStatement.setString(1, x.getId());
        preparedStatement.setString(2, x.getFirstname());
        preparedStatement.setString(3, x.getLastname());
        preparedStatement.setInt(4, x.getAge());
        preparedStatement.setString(5, x.getGender());
        preparedStatement.setString(6, x.getGeography());
        preparedStatement.setString(7, x.getEmail());
        preparedStatement.setString(8, x.getProfession());
        preparedStatement.setDouble(9, x.getSalary());
        preparedStatement.setInt(10, x.getAlive() ? 1 : 0);
        preparedStatement.executeUpdate();

    }

    public int updateAgeOfPerson() throws SQLException {

        PreparedStatement preparedStatement = connection.prepareStatement("update  person set age =41 where age = 40");

        return preparedStatement.executeUpdate();
    }


    public int deleteSomeUser() throws SQLException {

        PreparedStatement preparedStatement = connection.prepareStatement("delete from person where age > 30 and age <35");

        return preparedStatement.executeUpdate();

    }

    public int brazilianPeople() throws SQLException {

        PreparedStatement preparedStatement = connection.prepareStatement("select count(id) from person where geography = (?)");
        preparedStatement.setString(1, "Brazil");
        ResultSet result = preparedStatement.executeQuery();
        result.next();
        return result.getInt(1);

    }

    public List<String> comeBackToLife() throws SQLException {

        List<String> result = new ArrayList<>();
        PreparedStatement preparedStatement = connection.prepareStatement("select id from person where isAlive = (?)");
        preparedStatement.setInt(1, 0);
        ResultSet resultSet = preparedStatement.executeQuery();

        while (resultSet.next()){

            result.add(resultSet.getString("id"));

        }

        return result;

    }


}
