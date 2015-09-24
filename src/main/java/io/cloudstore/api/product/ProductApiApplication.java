package io.cloudstore.api.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.core.env.Environment;

/**
 * @author chanwook
 */
@SpringBootApplication
@EnableEurekaClient
public class ProductApiApplication {

    @Autowired
    Environment env;

    public static void main(String[] args) {
        SpringApplication.run(ProductApiApplication.class, args);
    }
}
