package com.robert.migration.datamigration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@SpringBootApplication
@ComponentScan(value="com.robert.migration")
public class DataMigrationApplication {
    public static void main(String[] args) {
        SpringApplication.run(DataMigrationApplication.class, args);
    }
}
