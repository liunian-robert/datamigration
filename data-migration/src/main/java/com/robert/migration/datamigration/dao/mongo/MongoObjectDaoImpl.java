package com.robert.migration.datamigration.dao.mongo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Component;

@Component
public class MongoObjectDaoImpl implements MongoObjectDao {

    @Autowired
    @Qualifier(value = "primaryMongoTemplate")
    protected MongoTemplate primaryMongoTemplate;

    @Autowired
    @Qualifier(value = "secondaryMongoTemplate")
    protected MongoTemplate secondaryMongoTemplate;
}
