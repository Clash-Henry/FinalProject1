package com.wtu.service;

import com.wtu.entity.Comment;

import java.util.List;

public interface CommentService {
    //根据动态编号mid查询评论
    List<Comment> selectCommentById(int id);
    //发布评论
    void insertComment(Comment comment);

    void deleteComment(int mid);
}
