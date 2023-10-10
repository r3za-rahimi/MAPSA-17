package com.mapsa.javacore.libraryautomation.service.dao;

import com.mapsa.javacore.libraryautomation.model.Book;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public abstract class BasicDAO<T> {

    protected Connection connection;

    public BasicDAO() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/library", "root", "1234");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public abstract T select(Long id) throws Exception;
    public abstract void insert(T t) throws SQLException;

    public abstract void delete(Long id);

    public abstract void update(T t);
    //    public abstract void delete(T t);
}
