package io.cloudstore.api.product;

import io.cloudstore.api.product.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author chanwook
 */
public interface ProductJpaRepository extends JpaRepository<Product, String> {
}
