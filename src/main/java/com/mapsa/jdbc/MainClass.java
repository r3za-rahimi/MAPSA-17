package com.mapsa.jdbc;

import com.mapsa.jdbc.service.DAO;
import com.mapsa.jdbc.service.PeopleFactory;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.SQLException;

public class MainClass {


    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        DAO dao = new DAO();

//        dao.select();
//        System.out.println(dao.updateAgeOfPerson());
//        System.out.println(dao.deleteSomeUser());
        System.out.println(dao.brazilianPeople());
        System.out.println(dao.comeBackToLife());

//        PeopleFactory.makePeople().forEach(x -> {
//            try {
//                dao.insert(x);
//            } catch (SQLException e) {
//                throw new RuntimeException(e);
//            }
//        });



    }
}
