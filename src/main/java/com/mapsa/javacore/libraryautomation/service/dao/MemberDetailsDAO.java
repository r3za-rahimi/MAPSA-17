package com.mapsa.javacore.libraryautomation.service.dao;

import com.mapsa.javacore.libraryautomation.model.MemberDetails;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MemberDetailsDAO extends BasicDAO<MemberDetails>{
    @Override
    public MemberDetails select(Long id) throws Exception {
        return null;
    }

    @Override
    public void insert(MemberDetails memberDetails) throws SQLException {

        PreparedStatement preparedStatement = connection.prepareStatement("insert into memberDetails (id , memberId ,phoneNumber , address) values (?,?,?,?)");
        preparedStatement.setLong(1,memberDetails.getId());
        preparedStatement.setLong(2,memberDetails.getMemberId());
        preparedStatement.setString(3,memberDetails.getPhoneNumber());
        preparedStatement.setString(4,memberDetails.getAddress());

        preparedStatement.executeUpdate();

    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public void update(MemberDetails memberDetails) {

    }
}
