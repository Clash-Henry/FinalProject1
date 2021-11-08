package com.wtu.service;

import com.wtu.entity.Comment;
import com.wtu.mapper.CommentMapper;
import com.wtu.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentServiceImpl implements CommentService {
    @Autowired
    private CommentMapper commentMapper;
    @Autowired
    private UserMapper userMapper;
    @Override
    public List<Comment> selectCommentById(int id) {
        List<Comment> commentList = commentMapper.selectCommentById(id);
        for (Comment comment : commentList) {
            comment.setUser(userMapper.userById(comment.getUid()));
        }
        return commentList;
    }

    @Override
    public void insertComment(Comment comment) {
        commentMapper.insertComment(comment);
    }

    @Override
    public void deleteComment(int mid) {
        commentMapper.deleteComment(mid);
    }
}
