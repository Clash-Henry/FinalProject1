package com.wtu.controller;

import com.wtu.entity.Comment;
import com.wtu.service.CommentService;
import com.wtu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class CommentController {
    @Autowired
    private CommentService commentService;
    @Autowired
    private UserService userService;

    @RequestMapping("selectById")
    public void selectCommentById(int id,Model model){
        List<Comment> commentList = commentService.selectCommentById(id);
        model.addAttribute("commentList",commentList);
    }

    @RequestMapping("insertComment/{username}")
    public String insertComment(@PathVariable String username, HttpServletRequest request){
        //获取uid
        int uid = userService.UidByUser(username);
        //获取cid
        int mid = Integer.parseInt(request.getParameter("mid"));
        //获取评论
        String view = request.getParameter("comment");
        Comment comment = new Comment();
        comment.setUid(uid);
        comment.setMid(mid);
        comment.setComment(view);
        commentService.insertComment(comment);
        return "redirect:/allmoments";
    }
}
