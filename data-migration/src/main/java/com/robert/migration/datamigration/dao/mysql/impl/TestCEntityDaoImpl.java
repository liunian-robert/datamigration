package com.robert.migration.datamigration.dao.mysql.impl;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @创建人: zhangyapo
 * @创建时间: 2018/10/17 17:14
 * @描述:数据源C对数据的操作
 */
@Component("TestCEntityDao")
public class TestCEntityDaoImpl {

    @Resource(name="TestCJdbcTemplate")
    private JdbcTemplate jdbcTemplate;

    /***
     * *************
     * 操作的数据接口实现
     ***************
     */
}