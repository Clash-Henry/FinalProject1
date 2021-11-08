package com.wtu.entity;

//关注
public class Following {
    private Integer fid;    //关注记录编号
    private Integer uid_a;  //关注者编号
    private Integer uid_b;  //被关注者编号
    private Integer mutual_following;//相互关注

    public Following() {
    }

    public Following(Integer uid_a, Integer uid_b, Integer mutual_following) {
        this.uid_a = uid_a;
        this.uid_b = uid_b;
        this.mutual_following = mutual_following;
    }

    public Following(Integer fid, Integer uid_a, Integer uid_b, Integer mutual_following) {
        this.fid = fid;
        this.uid_a = uid_a;
        this.uid_b = uid_b;
        this.mutual_following = mutual_following;
    }

    public Integer getFid() {
        return fid;
    }

    public void setFid(Integer fid) {
        this.fid = fid;
    }

    public Integer getUid_a() {
        return uid_a;
    }

    public void setUid_a(Integer uid_a) {
        this.uid_a = uid_a;
    }

    public Integer getUid_b() {
        return uid_b;
    }

    public void setUid_b(Integer uid_b) {
        this.uid_b = uid_b;
    }

    public Integer getMutual_following() {
        return mutual_following;
    }

    public void setMutual_following(Integer mutual_following) {
        this.mutual_following = mutual_following;
    }

    @Override
    public String toString() {
        return "Following{" +
                "fid=" + fid +
                ", uid_a=" + uid_a +
                ", uid_b=" + uid_b +
                ", mutual_following=" + mutual_following +
                '}';
    }
}
