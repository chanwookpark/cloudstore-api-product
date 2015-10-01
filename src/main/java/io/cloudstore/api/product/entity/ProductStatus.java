package io.cloudstore.api.product.entity;

/**
 * @author chanwook
 */
public enum ProductStatus {
    SL("SALES"), SO("SOLD_OUT"), BL("BLOCK");

    private String description;

    ProductStatus() {
    }

    ProductStatus(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
