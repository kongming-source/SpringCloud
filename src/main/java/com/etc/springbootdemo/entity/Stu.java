package com.etc.springbootdemo.entity;

public class Stu {

    private Integer sid;
    private String sname;
    private String sex;

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Stu(Integer sid, String sname, String sex) {
        this.sid = sid;
        this.sname = sname;
        this.sex = sex;
    }

    public Stu() {
    }
}
