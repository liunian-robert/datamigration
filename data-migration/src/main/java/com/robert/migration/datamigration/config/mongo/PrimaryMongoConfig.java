package com.robert.migration.datamigration.config.mongo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.mongodb.core.MongoTemplate;

@Configuration  //Configuration class
@ConfigurationProperties(prefix = "spring.data.mongodb.primary") //Defines my custom prefix and points to the primary db properties
public class PrimaryMongoConfig extends MongoDataSourceConfig {
     @Primary
     @Override    
     public @Bean(name = "primaryMongoTemplate")
     MongoTemplate getMongoTemplate() throws Exception {
         return new MongoTemplate(mongoDbFactory());    
     }
}