package com.zhongruan.dao;

import com.zhongruan.bean.User;

import java.util.List;

public interface IUser {
    public List<User> findUserById(int id);
}
