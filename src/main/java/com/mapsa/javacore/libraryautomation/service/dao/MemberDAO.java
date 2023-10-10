package com.mapsa.javacore.libraryautomation.service.dao;

import com.mapsa.javacore.libraryautomation.model.Member;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MemberDAO extends BasicDAO<Member>{

    MemberDetailsDAO memberDetailsDAO = new MemberDetailsDAO();

    @Override
    public Member select(Long id) throws Exception {
        return null;
    }

    @Override
    public void insert(Member member) throws SQLException {

        PreparedStatement preparedStatement = connection.prepareStatement("insert into member (id , name ,family , age) values (?,?,?,?)");
        preparedStatement.setLong(1,member.getId());
        preparedStatement.setString(2,member.getName());
        preparedStatement.setString(3,member.getFamily());
        preparedStatement.setInt(4,member.getAge());

        preparedStatement.executeUpdate();

        memberDetailsDAO.insert(member.getMemberDetails());



    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public void update(Member member) {

    }


    public void findAllInfoByPhoneNumber(String phoneNumber) throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement("select *  FROM " +
                "( select  m.name , m.family ,md.phonenumber , b.arthur from member m  JOIN  memberDetails  md on m.id =  md.memberId " +
                "JOIN book b on m.id = b.fk_member_id  ) as res WHERE res.phonenumber = ? ");

        preparedStatement.setString(1, phoneNumber );
        ResultSet resultSet = preparedStatement.executeQuery();

        while (resultSet.next()){
            StringBuilder result =  new StringBuilder(" ");
            result.append(" "+ resultSet.getString("name"));
            result.append(" "+ resultSet.getString("family"));
            result.append(" "+ resultSet.getString("phonenumber"));
            result.append(" "+ resultSet.getString("arthur"));


            System.out.println(result);


        }

    }
}
