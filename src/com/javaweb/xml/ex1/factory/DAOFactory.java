package com.javaweb.xml.ex1.factory;

import com.javaweb.xml.ex1.dao.IDeptDAO;
import com.javaweb.xml.ex1.dao.impl.DeptDAOImpl;

import java.sql.Connection;

/**
 * @author coderliaolong@outlook.com
 * @date 2021/3/2 23:29
 */
public class DAOFactory {
    public static IDeptDAO getIDeptDAO(Connection conn){
        return new DeptDAOImpl(conn);
    }
}
