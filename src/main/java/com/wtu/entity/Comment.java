package com.wtu.entity;

//评论
public class Comment {
    private Integer cid;    //评论编号
    private Integer mid;    //动态编号
    private Integer uid;    //评论发表者编号
    private User user;      //评论者
    private String comment; //评论内容

    public Comment() {
    }

    public Comment(Integer mid, Integer uid, String comment) {
        this.mid = mid;
        this.uid = uid;
        this.comment = comment;
    }

    public Comment(Integer cid, Integer mid, Integer uid, String comment) {
        this.cid = cid;
        this.mid = mid;
        this.uid = uid;
        this.comment = comment;
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public Integer getMid() {
        return mid;
    }

    public void setMid(Integer mid) {
        this.mid = mid;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Comment{" +
                "cid=" + cid +
                ", mid=" + mid +
                ", uid=" + uid +
                ", user=" + user +
                ", comment='" + comment + '\'' +
                '}';
    }
}
