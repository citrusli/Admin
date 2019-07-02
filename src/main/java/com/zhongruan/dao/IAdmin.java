package com.zhongruan.dao;

import com.zhongruan.bean.Admin;

import java.util.List;

public interface IAdmin {
    public List<Admin> findAll();
    public Admin findAdminById(int id);
    public Admin findAdminByNamePass(Admin admin);
    public void addAdmin(Admin admin);
    public void delAdmin(int id);
    public void updateAdmin(Admin admin);
}
