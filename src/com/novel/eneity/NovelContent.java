package com.novel.eneity;

public class NovelContent {
    private String zhangjieid;
    private String zhangjiename;
    private String zhangjieleirong;
    private String xiaoshuoid;

    @Override
    public String toString() {
        return "NovelContent{" +
                "zhangjieid='" + zhangjieid + '\'' +
                ", zhangjiename='" + zhangjiename + '\'' +
                ", zhangjieleirong='" + zhangjieleirong + '\'' +
                ", xiaoshuoid='" + xiaoshuoid + '\'' +
                '}';
    }

    public String getZhangjieid() {
        return zhangjieid;
    }

    public void setZhangjieid(String zhangjieid) {
        this.zhangjieid = zhangjieid;
    }

    public String getZhangjiename() {
        return zhangjiename;
    }

    public void setZhangjiename(String zhangjiename) {
        this.zhangjiename = zhangjiename;
    }

    public String getZhangjieleirong() {
        return zhangjieleirong;
    }

    public void setZhangjieleirong(String zhangjieleirong) {
        this.zhangjieleirong = zhangjieleirong;
    }

    public String getXiaoshuoid() {
        return xiaoshuoid;
    }

    public void setXiaoshuoid(String xiaoshuoid) {
        this.xiaoshuoid = xiaoshuoid;
    }

    public NovelContent(String zhangjieid, String zhangjiename, String zhangjieleirong, String xiaoshuoid) {
        this.zhangjieid = zhangjieid;
        this.zhangjiename = zhangjiename;
        this.zhangjieleirong = zhangjieleirong;
        this.xiaoshuoid = xiaoshuoid;
    }
}
