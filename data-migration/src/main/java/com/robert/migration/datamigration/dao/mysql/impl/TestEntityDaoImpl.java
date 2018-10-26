package com.robert.migration.datamigration.dao.mysql.impl;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @创建人: zhangyapo
 * @创建时间: 2018/10/17 17:18
 * @描述: 当前数据源的数据操作
 */
@Component("TestEntityDao")
public class TestEntityDaoImpl {
    @Resource(name="JdbcTemplate")
    private JdbcTemplate jdbcTemplate;

    public TestEntityDaoImpl(){

    }

    /***
     * *************
     * 操作的数据接口实现
     ***************
     */
}
