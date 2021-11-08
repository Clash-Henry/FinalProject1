package com.wtu.controller;

import com.wtu.entity.Moment;
import com.wtu.service.CommentService;
import com.wtu.service.MomentService;
import com.wtu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.List;

@Controller
public class MomentController {
    @Autowired
    private MomentService momentService;
    @Autowired
    private CommentService commentService;
    @Autowired
    private UserService userService;
    //所有动态
    @RequestMapping("/allmoments")
    public String allMoments(Model model){
        List<Moment> momentList = momentService.allMoments();
        for (Moment moment : momentList) {
            moment.setUser(userService.userById(moment.getUid()));
            moment.setCommentList(commentService.selectCommentById(moment.getMid()));
        }
        model.addAttribute("momentList",momentList);
        return "homepage";
    }

    //点赞动态
    @RequestMapping("/lovemoment")
    public String lovemoment(int id){
        momentService.loveMoment(id);
        return "redirect:/allmoments";
    }

    //新增一条动态
    @RequestMapping("/insertMoment")
    public String insertMoment(HttpServletRequest request){
        Moment moment = new Moment();
        //根据用户名查uid，uid和moment传入
        String article = request.getParameter("article");
        moment.setArticle(article);
        String username = request.getParameter("username");
        int uid = userService.UidByUser(username);
        moment.setUid(uid);
        Date date = new Date();
        moment.setCreationdate(date);

        momentService.insertMoment(moment);
        return "redirect:/allmoments";
    }

    //搜索一条动态
    @RequestMapping("/researchMoment")
    public String researchMoment(String research, Model model){
        List<Moment> momentList = momentService.researchMoment(research);
        model.addAttribute("momentList", momentList);
        return "homepage";
    }

    //删除一条动态
    @RequestMapping("/deleteMoment/{mid}")
    public String deleteMoment(@PathVariable int mid){
        commentService.deleteComment(mid);
        momentService.deleteMoment(mid);

        return "redirect:/allmoments";
    }


}
