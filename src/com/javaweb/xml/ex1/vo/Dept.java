package com.javaweb.xml.ex1.vo;

/**
 * @author coderliaolong@outlook.com
 * @date 2021/3/2 23:00
 */
public class Dept {
    private int deptno;
    private String dname;
    private String loc;

    public int getDeptno() {
        return deptno;
    }

    public String getDname() {
        return dname;
    }

    public String getLoc() {
        return loc;
    }

    public void setDeptno(int deptno) {
        this.deptno = deptno;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public void setLoc(String loc) {
        this.loc = loc;
    }
}
