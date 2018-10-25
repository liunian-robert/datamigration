package com.robert.migration.datamigration.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

/**
 * @创建人: zhangyapo
 * @创建时间: 2018/10/17 14:43
 * @描述: 多个数据源配置,复杂的数据升级或迁移一般都需要多个数据源,并且通过多个数据源进行数据逻辑处理后迁移或升级到具体的库中
 */
@Configuration
public class DataSourceConfig {

    public DataSourceConfig() {

    }
    @Bean(name = "TestBDataSource")
    @Qualifier("TestBDataSource")
    @ConfigurationProperties(prefix="spring.datasource.testB")
    public DataSource configTestBDataSource() {
        return DataSourceBuilder.create().build();
    }

    @Bean(name = "TestADataSource")
    @Qualifier("TestADataSource")
    @ConfigurationProperties(prefix="spring.datasource.testA")
    public DataSource configTestADataSource() {
        return DataSourceBuilder.create().build();
    }

    @Bean(name = "TestDataSource")
    @Qualifier("TestDataSource")
    @Primary
    @ConfigurationProperties(prefix="spring.datasource")
    public DataSource configTestDataSource() {
        return DataSourceBuilder.create().build();
    }

    @Bean(name = "TestCDataSource")
    @Qualifier("TestCDataSource")
    @ConfigurationProperties(prefix="spring.datasource.testC")
    public DataSource configTestCDataSource() {
        return DataSourceBuilder.create().build();
    }

    @Bean(name = "TestBJdbcTemplate")
    public JdbcTemplate getTestBJdbcTemplate(
            @Qualifier("TestBDataSource") DataSource dataSource) {
        return new JdbcTemplate(dataSource);
    }

    @Bean(name = "TestAJdbcTemplate")
    public JdbcTemplate getTestAdbcTemplate(
            @Qualifier("TestADataSource") DataSource dataSource) {
        return new JdbcTemplate(dataSource);
    }

    @Bean(name = "JdbcTemplate")
    public JdbcTemplate getTestJdbcTemplate(
            @Qualifier("TestDataSource") DataSource dataSource) {
        return new JdbcTemplate(dataSource);
    }

    @Bean(name = "TestCJdbcTemplate")
    public JdbcTemplate getTestCJdbcTemplate(
            @Qualifier("TestCDataSource") DataSource dataSource) {
        return new JdbcTemplate(dataSource);
    }

}