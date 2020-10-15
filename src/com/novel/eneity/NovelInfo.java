package com.novel.eneity;

public class NovelInfo {
    private String xiaoshuoid;
    private String xiaoshuoname;
    private String xiaoshuofenleiid;
    private String xiaoshuoimg;

    @Override
    public String toString() {
        return "NovelInfo{" +
                "xiaoshuoid='" + xiaoshuoid + '\'' +
                ", xiaoshuoname='" + xiaoshuoname + '\'' +
                ", xiaoshuofenleiid='" + xiaoshuofenleiid + '\'' +
                ", xiaoshuoimg='" + xiaoshuoimg + '\'' +
                '}';
    }

    public String getXiaoshuoid() {
        return xiaoshuoid;
    }

    public void setXiaoshuoid(String xiaoshuoid) {
        this.xiaoshuoid = xiaoshuoid;
    }

    public String getXiaoshuoname() {
        return xiaoshuoname;
    }

    public void setXiaoshuoname(String xiaoshuoname) {
        this.xiaoshuoname = xiaoshuoname;
    }

    public String getXiaoshuofenleiid() {
        return xiaoshuofenleiid;
    }

    public void setXiaoshuofenleiid(String xiaoshuofenleiid) {
        this.xiaoshuofenleiid = xiaoshuofenleiid;
    }

    public String getXiaoshuoimg() {
        return xiaoshuoimg;
    }

    public void setXiaoshuoimg(String xiaoshuoimg) {
        this.xiaoshuoimg = xiaoshuoimg;
    }

    public NovelInfo(String xiaoshuoid, String xiaoshuoname, String xiaoshuofenleiid, String xiaoshuoimg) {
        this.xiaoshuoid = xiaoshuoid;
        this.xiaoshuoname = xiaoshuoname;
        this.xiaoshuofenleiid = xiaoshuofenleiid;
        this.xiaoshuoimg = xiaoshuoimg;
    }
}
