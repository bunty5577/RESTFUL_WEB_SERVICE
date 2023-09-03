package com.javaproject.springboot.entities;

public class Course {

    private int cid;
    private  String Cname;
    private  String description;

    public Course() {
    }

    public Course(int cid, String cname, String description) {
        this.cid = cid;
        Cname = cname;
        this.description = description;
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public String getCname() {
        return Cname;
    }

    public void setCname(String cname) {
        Cname = cname;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
