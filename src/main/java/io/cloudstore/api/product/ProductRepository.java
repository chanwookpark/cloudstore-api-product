package io.cloudstore.api.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;

/**
 * @author chanwook
 */
@Repository
public class ProductRepository {

    @Autowired(required = true)
    private DataSource dataSource;
}
