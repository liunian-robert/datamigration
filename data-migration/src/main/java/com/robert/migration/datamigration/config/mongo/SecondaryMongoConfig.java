package com.robert.migration.datamigration.config.mongo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.core.MongoTemplate;

@Configuration
@ConfigurationProperties(prefix = "spring.data.mongodb.secondary") //Defines my custom prefix and points to the primary db properties
public class SecondaryMongoConfig extends MongoDataSourceConfig {
     @Override
     public @Bean(name = "secondaryMongoTemplate")
     MongoTemplate getMongoTemplate() throws Exception {
         return new MongoTemplate(mongoDbFactory());    
     }
}