package com.sit.cloudnative.UserService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class UserADO implements UserADOInterface{
    
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public User getUserById(int user_id){
        String sql = "SELECT id, firstname, lastname FROM USERS WHERE id = ?";
        return jdbcTemplate.queryForObject(sql, new UserRowMapper(), user_id);
        
    }

    @Override
    public List<User> getAllUser(){
        String sql = "SELECT id, firstname, lastname FROM USERS";
        return jdbcTemplate.query(sql, new UserRowMapper()); 
    }
}