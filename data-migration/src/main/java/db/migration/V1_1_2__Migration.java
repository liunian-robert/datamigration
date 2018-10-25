package db.migration;

import com.robert.migration.datamigration.common.BaseDataSourceCopyMigration;
import com.robert.migration.datamigration.dao.TestAEntityDao;
import com.robert.migration.datamigration.dao.TestBEntityDao;
import com.robert.migration.datamigration.dao.TestCEntityDao;
import com.robert.migration.datamigration.dao.TestEntityDao;
import org.jsoup.Jsoup;
import org.jsoup.nodes.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

import java.util.List;

/**
 * 1.1.2版本java程序进行数据迁移或升级
 * @Author zhangyapo
 * @Date 2018/10/17 9:39.
 */
public class V1_1_2__Migration extends BaseDataSourceCopyMigration {
    private Logger logger = LoggerFactory.getLogger(V1_1_2__Migration.class);

    public V1_1_2__Migration() {
        super();
    }

    @Transactional(rollbackFor = Exception.class)
    @Override
    public void doMigrate(TestEntityDao testEntityDao, TestAEntityDao testAEntityDao, TestBEntityDao testBEntityDao, TestCEntityDao testCEntityDao) throws Exception {
        logger.info("---------------------------------开始升级数据---------------------------------");
        /**
         * 1.1.2版本 具体的数据升级逻辑
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
