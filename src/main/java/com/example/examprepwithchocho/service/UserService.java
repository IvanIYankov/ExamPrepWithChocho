package com.example.examprepwithchocho.service;

import com.example.examprepwithchocho.model.entity.User;
import com.example.examprepwithchocho.model.service.UserServiceModel;
import com.example.examprepwithchocho.model.view.UserViewModel;

import java.util.List;

public interface UserService {
    UserServiceModel registerUser(UserServiceModel userServiceModel);

    UserServiceModel findByUsernameAndPassword(String username, String password);

    void loginUser(Long id, String username);

    User findById(Long id);

    List<UserViewModel> findAllUserAndCountOfOrdersOrderedByCountDesc();
}
