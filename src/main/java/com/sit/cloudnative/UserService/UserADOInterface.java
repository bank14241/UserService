package com.sit.cloudnative.UserService;

import java.util.List;

public interface UserADOInterface {
    public User getUserById(int user_id);
    List<User> getAllUser();
}