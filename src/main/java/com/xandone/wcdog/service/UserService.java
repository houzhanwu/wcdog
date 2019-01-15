package com.xandone.wcdog.service;

import com.xandone.wcdog.pojo.UserBean;

import java.util.List;

public interface UserService {
    UserBean addUser(UserBean userBean) throws Exception;

    UserBean getUserByName(String name) throws Exception;

    UserBean getUserById(String userId) throws Exception;

    UserBean getUserByNick(String userId) throws Exception;

    List<UserBean> getAllUser(Integer page, Integer row) throws Exception;

}
