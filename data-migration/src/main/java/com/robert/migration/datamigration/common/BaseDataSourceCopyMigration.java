package com.robert.migration.datamigration.common;

import com.robert.migration.datamigration.dao.TestAEntityDao;
import com.robert.migration.datamigration.dao.TestBEntityDao;
import com.robert.migration.datamigration.dao.TestCEntityDao;
import com.robert.migration.datamigration.dao.TestEntityDao;
import org.flywaydb.core.api.migration.spring.BaseSpringJdbcMigration;
import org.springframework.jdbc.core.JdbcTemplate;


/**
 * @Author zhangyapo
 * @Date 2018/4/11 10:58.
 */
public abstract class BaseDataSourceCopyMigration extends BaseSpringJdbcMigration {

    protected TestEntityDao testEntityDao;

    protected TestAEntityDao testAEntityDao;

    protected TestBEntityDao testBEntityDao;

    protected TestCEntityDao testCEntityDao;

    protected JdbcTemplate jdbcTemplate;


    public BaseDataSourceCopyMigration(TestEntityDao testEntityDao, TestAEntityDao testAEntityDao, TestBEntityDao testBEntityDao, TestCEntityDao testCEntityDao) {
        this.testEntityDao = SpringUtil.getBean("TestEntityDao",TestEntityDao.class);
        this.testAEntityDao = SpringUtil.getBean("TestAEntityDao",TestAEntityDao.class);
        this.testBEntityDao = SpringUtil.getBean("TestBEntityDao",TestBEntityDao.class);
        this.testCEntityDao = SpringUtil.getBean("TestCEntityDao",TestCEntityDao.class);
        jdbcTemplate = SpringUtil.getBean("JdbcTemplate",JdbcTemplate.class);
    }

    public BaseDataSourceCopyMigration() {

    }

    @Override
    public void migrate(JdbcTemplate jdbcTemplate) throws Exception {
        this.testEntityDao = SpringUtil.getBean("TestEntityDao",TestEntityDao.class);
        this.testAEntityDao = SpringUtil.getBean("TestAEntityDao",TestAEntityDao.class);
        this.testBEntityDao = SpringUtil.getBean("TestBEntityDao",TestBEntityDao.class);
        this.testCEntityDao = SpringUtil.getBean("TestCEntityDao",TestCEntityDao.class);
        jdbcTemplate = SpringUtil.getBean("JdbcTemplate",JdbcTemplate.class);
        doMigrate(this.testEntityDao, testAEntityDao, testBEntityDao,testCEntityDao);
    }

    protected abstract void doMigrate(TestEntityDao testEntityDao, TestAEntityDao testAEntityDao, TestBEntityDao testBEntityDao, TestCEntityDao testCEntityDao) throws Exception;
}
