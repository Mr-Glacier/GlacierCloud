package com.glacier.bean;

import java.math.BigDecimal;

/**
 * @author Mr-Glacier
 * @version 1.0
 * @apiNote 商品实体类
 * @since 2025/6/12 17:11
 */
public class Product {

    private Long Id;
    private String productName;
    private String productDesc;
    private BigDecimal price;
    private Integer status;
    private int number;

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        this.Id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductDesc() {
        return productDesc;
    }

    public void setProductDesc(String productDesc) {
        this.productDesc = productDesc;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
