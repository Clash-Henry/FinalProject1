package com.wtu.entity;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

//用户
public class User {
    private Integer uid;    //用户编号
    private String username;//用户名
    private String password;//密码
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date birthday;  //生日
    private String sex;     //性别

    public User() {
    }

    public User(String username, String password, Date birthday, String sex) {
        this.username = username;
        this.password = password;
        this.birthday = birthday;
        this.sex = sex;
    }

    public User(Integer uid, String username, String password, Date birthday, String sex) {
        this.uid = uid;
        this.username = username;
        this.password = password;
        this.birthday = birthday;
        this.sex = sex;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "User{" +
                "uid=" + uid +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", birthday=" + birthday +
                ", sex='" + sex + '\'' +
                '}';
    }
}
