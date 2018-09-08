package com.sit.cloudnative.UserService;

import java.util.List;

public interface UserServiceInterface {
    public User getUserById(int user_id);
    public List<User> getAllUser();
}