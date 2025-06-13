package com.glacier.bean;

import java.math.BigDecimal;
import java.util.List;

/**
 * @author Mr-Glacier
 * @version 1.0
 * @apiNote 订单详情类
 * @since 2025/6/13 10:09
 */
public class Order {
    /**
     * 订单编号
     */
    private Long id;
    /**
     * 订单总价
     */
    private BigDecimal totalPrice;
    private Long userId;
    private String nickName;

    private String address;

    private List<Object> productList;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public BigDecimal getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(BigDecimal totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<Object> getProductList() {
        return productList;
    }

    public void setProductList(List<Object> productList) {
        this.productList = productList;
    }
}
