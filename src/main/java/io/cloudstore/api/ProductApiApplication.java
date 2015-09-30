package io.cloudstore.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author chanwook
 */
@SpringBootApplication
@EnableEurekaClient
@RestController
public class ProductApiApplication extends SpringBootServletInitializer {

    @Autowired
    Environment env;

    @RequestMapping("/")
    public String hello() {return "hello";}

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(ProductApiApplication.class);
    }


    public static void main(String[] args) {
        SpringApplication.run(ProductApiApplication.class, args);
    }
}
