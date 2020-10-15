package com.novel.eneity;

public class NovelKind {
    private Integer xiaoshuofenleiid;
    private String fenleiname;

    @Override
    public String toString() {
        return "NovelKind{" +
                "xiaoshuofenleiid=" + xiaoshuofenleiid +
                ", fenleiname='" + fenleiname + '\'' +
                '}';
    }

    public Integer getXiaoshuofenleiid() {
        return xiaoshuofenleiid;
    }

    public void setXiaoshuofenleiid(Integer xiaoshuofenleiid) {
        this.xiaoshuofenleiid = xiaoshuofenleiid;
    }

    public String getFenleiname() {
        return fenleiname;
    }

    public void setFenleiname(String fenleiname) {
        this.fenleiname = fenleiname;
    }

    public NovelKind(Integer xiaoshuofenleiid, String fenleiname) {
        this.xiaoshuofenleiid = xiaoshuofenleiid;
        this.fenleiname = fenleiname;
    }
}
