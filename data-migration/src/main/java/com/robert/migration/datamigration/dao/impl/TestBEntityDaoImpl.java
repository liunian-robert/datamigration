package com.robert.migration.datamigration.dao.impl;

import com.robert.migration.datamigration.dao.TestBEntityDao;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @创建人: zhangyapo
 * @创建时间: 2018/10/17 17:14
 * @描述:数据源B对数据的操作
 */
@Component("TestBEntityDao")
public class TestBEntityDaoImpl implements TestBEntityDao {
    @Resource(name="TestBJdbcTemplate")
    private JdbcTemplate jdbcTemplate;

    public TestBEntityDaoImpl(){

    }

    /***
     * *************
     * 操作的数据接口实现
     ***************
     */
}
