package io.cloudstore.api.product.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

import javax.persistence.*;

/**
 * @author chanwook
 */
@Entity
@Table(name = "PRD_PRODUCT")
@Getter
@Setter
@AllArgsConstructor
@Slf4j
public class Product {

    @Id
    private String productId;

    @Column(length = 100, unique = true, nullable = false)
    private String productName;

    @Column(length = 255)
    private String displayName;

    @Column(length = 2)
    @Enumerated(EnumType.STRING)
    private ProductStatus status;


}
