package com.zhongruan.dao;

import com.zhongruan.bean.Status;

import java.util.List;

public interface IStatus {
    public List<Status> getAllStatus();
    public List<Status> getIdByStatusName(String name);
    public List<Status> getStatusById(int id);
}
