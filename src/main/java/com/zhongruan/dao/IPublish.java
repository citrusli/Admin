package com.zhongruan.dao;

import com.zhongruan.bean.Publish;

import java.util.List;

public interface IPublish {
    public List<Publish> findByName(String pubName);
    public void addPublish(Publish publish);
    public List<Publish> findAllPublish();
}
