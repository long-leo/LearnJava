package com.javaweb.xml.ex1.dao;

import com.javaweb.xml.ex1.vo.Dept;

import java.util.Set;

/**
 * @author coderliaolong@outlook.com
 * @date 2021/3/2 23:05
 */
public interface IDeptDAO {

    /**
     * 查询表格中的所有数据
     * @return 如果表中有数据, 返回VO对象的Set集合, <br />
     *         如果没有数据, 集合长度为0, 不是null
     */
    Set<Dept> findALl() throws Exception;

}
