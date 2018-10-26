package db.migration;

import com.robert.migration.datamigration.common.BaseDataSourceCopyMigration;
import com.robert.migration.datamigration.dao.mysql.TestAEntityDao;
import com.robert.migration.datamigration.dao.mysql.TestBEntityDao;
import com.robert.migration.datamigration.dao.mysql.TestCEntityDao;
import com.robert.migration.datamigration.dao.mysql.TestEntityDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.transaction.annotation.Transactional;

/**
 * 1.1.1版本java程序进行数据迁移或升级
 * @Author zhangyapo
 * @Date 2018/10/17 9:39.
 */
public class V1_1_1__Migration extends BaseDataSourceCopyMigration {
    private Logger logger = LoggerFactory.getLogger(V1_1_1__Migration.class);

    public V1_1_1__Migration() {
        super();
    }

    @Transactional
    @Override
    protected void doMigrate(TestEntityDao testEntityDao, TestAEntityDao testAEntityDao, TestBEntityDao testBEntityDao, TestCEntityDao testCEntityDao, MongoTemplate primaryMongoTemplate, MongoTemplate secondaryMongoTemplate) throws Exception {
        logger.info("---------------------------------开始升级数据---------------------------------");
        /**
         * 1.1.1版本 具体的数据升级逻辑
         */
        /******
         *
         *
         *
         *
         */
        logger.info("---------------------------------完成升级数据---------------------------------");
    }
}
