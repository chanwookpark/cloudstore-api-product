package io.cloudstore.api.product;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.sql.DataSource;
import javax.transaction.Transactional;

/**
 * @author chanwook
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = EntityTestConfiguration.class)
@Transactional
public class ProductEntityTest {

    @Autowired
    DataSource dataSource;

    @Autowired
    ProductJpaRepository r;

    @Test
    public void config() throws Exception {
        assert dataSource != null;
        assert r != null;
    }
}
