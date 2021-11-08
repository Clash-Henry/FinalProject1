package com.wtu.entity;

import java.util.Date;
import java.util.List;

//动态
public class Moment {
    private Integer mid;        //动态编号
    private Integer uid;        //发布者编号
    private User user;          //用户
    private String article;     //内容
    private Date creationdate;  //发布时间
    private Integer lovetimes;  //点赞数
    private List<Comment> commentList;//评论列表

    public Moment() {
    }

    public Moment(Integer uid, String article, Date creationdate, Integer lovetimes) {
        this.uid = uid;
        this.article = article;
        this.creationdate = creationdate;
        this.lovetimes = lovetimes;
    }

    public Moment(Integer mid, Integer uid, String article, Date creationdate, Integer lovetimes) {
        this.mid = mid;
        this.uid = uid;
        this.article = article;
        this.creationdate = creationdate;
        this.lovetimes = lovetimes;
    }

    public Integer getMid() {
        return mid;
    }

    public void setMid(Integer mid) {
        this.mid = mid;
    }

    public String getArticle() {
        return article;
    }

    public void setArticle(String article) {
        this.article = article;
    }

    public Date getCreationdate() {
        return creationdate;
    }

    public void setCreationdate(Date creationdate) {
        this.creationdate = creationdate;
    }

    public Integer getLovetimes() {
        return lovetimes;
    }

    public void setLovetimes(Integer lovetimes) {
        this.lovetimes = lovetimes;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public List<Comment> getCommentList() {
        return commentList;
    }

    public void setCommentList(List<Comment> commentList) {
        this.commentList = commentList;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Moment{" +
                "mid=" + mid +
                ", uid=" + uid +
                ", article='" + article + '\'' +
                ", creationdate=" + creationdate +
                ", lovetimes=" + lovetimes +
                '}';
    }
}
