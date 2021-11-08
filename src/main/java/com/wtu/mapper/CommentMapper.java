package com.wtu.mapper;

import com.wtu.entity.Comment;

import java.util.List;

public interface CommentMapper {
    //根据动态编号mid查询评论
    List<Comment> selectCommentById(int id);

    void insertComment(Comment comment);

    void deleteComment(int mid);
}
