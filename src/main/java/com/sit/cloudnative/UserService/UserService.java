package com.sit.cloudnative.UserService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService implements UserServiceInterface{
    @Autowired
    private UserADOInterface userADO;

    @Override
    public User getUserById(int user_id){
        User user = userADO.getUserById(user_id);
        return user;
    }

    @Override
	public List<User> getAllUser() {
		return userADO.getAllUser();
	}
}