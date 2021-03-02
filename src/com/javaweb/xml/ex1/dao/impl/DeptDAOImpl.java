package com.javaweb.xml.ex1.dao.impl;

import com.javaweb.xml.ex1.dao.IDeptDAO;
import com.javaweb.xml.ex1.vo.Dept;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.HashSet;
import java.util.Set;

/**
 * @author coderliaolong@outlook.com
 * @date 2021/3/2 23:15
 */
public class DeptDAOImpl implements IDeptDAO {
    private Connection conn;
    private PreparedStatement pstmt;

    public DeptDAOImpl(Connection conn) {
        this.conn = conn;
    }

    @Override
    public Set<Dept> findALl() throws Exception {
        Set<Dept> all = new HashSet<Dept>();
        String sql = "SELECT deptno, dname, loc" +
                " FROM dept" ;
        this.pstmt = conn.prepareStatement(sql);
        ResultSet rs = pstmt.executeQuery();
        while(rs.next()){
            Dept vo = new Dept();
            vo.setDeptno(rs.getInt(1));
            vo.setDname(rs.getString(2));
            vo.setLoc(rs.getString(3));
            all.add(vo);
        }
        return all;
    }
}
