package com.robert.migration.datamigration.dao.mapper;

import com.robert.migration.datamigration.domain.User;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class UserRowMapper implements RowMapper<User> {
    @Override
    public User mapRow(ResultSet resultSet, int i) throws SQLException {
            //获取结果集中的数据
            String userId = resultSet.getString("userId");
            String username = resultSet.getString("username");
            String email = resultSet.getString("email");
            String phone = resultSet.getString("phone");
            String address = resultSet.getString("address");
            //把数据封装成User对象
            User user = new User();
            user.setUserId(userId);
            user.setUsername(username);
            user.setAddress(address);
            user.setEmail(email);
            user.setPhone(phone);
            return user;
    }
}