package com.robert.migration.datamigration.common;

import com.robert.migration.datamigration.dao.mysql.TestAEntityDao;
import com.robert.migration.datamigration.dao.mysql.TestBEntityDao;
import com.robert.migration.datamigration.dao.mysql.TestCEntityDao;
import com.robert.migration.datamigration.dao.mysql.TestEntityDao;
import org.flywaydb.core.api.migration.spring.BaseSpringJdbcMigration;
import org.springframework.data.mongodb.core.MongoTemplate;
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

    protected MongoTemplate primaryMongoTemplate;

    protected MongoTemplate secondaryMongoTemplate;


    public BaseDataSourceCopyMigration(TestEntityDao testEntityDao, TestAEntityDao testAEntityDao, TestBEntityDao testBEntityDao, TestCEntityDao testCEntityDao) {
        this.testEntityDao = SpringUtil.getBean("TestEntityDao",TestEntityDao.class);
        this.testAEntityDao = SpringUtil.getBean("TestAEntityDao",TestAEntityDao.class);
        this.testBEntityDao = SpringUtil.getBean("TestBEntityDao",TestBEntityDao.class);
        this.testCEntityDao = SpringUtil.getBean("TestCEntityDao",TestCEntityDao.class);
        this.primaryMongoTemplate = SpringUtil.getBean("primaryMongoTemplate",MongoTemplate.class);
        this.secondaryMongoTemplate = SpringUtil.getBean("secondaryMongoTemplate",MongoTemplate.class);
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
        this.primaryMongoTemplate = SpringUtil.getBean("primaryMongoTemplate",MongoTemplate.class);
        this.secondaryMongoTemplate = SpringUtil.getBean("secondaryMongoTemplate",MongoTemplate.class);
        jdbcTemplate = SpringUtil.getBean("JdbcTemplate",JdbcTemplate.class);
        doMigrate(this.testEntityDao, testAEntityDao, testBEntityDao,testCEntityDao,primaryMongoTemplate,secondaryMongoTemplate);
    }

    protected abstract void doMigrate(TestEntityDao testEntityDao, TestAEntityDao testAEntityDao, TestBEntityDao testBEntityDao, TestCEntityDao testCEntityDao,MongoTemplate primaryMongoTemplate,MongoTemplate secondaryMongoTemplate) throws Exception;
}
