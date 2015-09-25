package io.cloudstore.api.product;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author chanwook
 */
@RestController
public class ProductController {

    @RequestMapping(value = "/product/{productId}", method = RequestMethod.GET)
    public ProductResource getProduct(@PathVariable String productId) {

        return new ProductResource(productId, "name", 100);
    }
}
