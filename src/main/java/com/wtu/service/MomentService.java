package com.wtu.service;

import com.wtu.entity.Moment;

import java.util.List;

public interface MomentService {
    //所有动态
    List<Moment> allMoments();
    //发布动态（添加）
    void insertMoment(Moment moment);
    //点赞动态
    void loveMoment(int id);
    //搜索动态
    List<Moment> researchMoment(String research);
    //删除动态
    void deleteMoment(int mid);
}
