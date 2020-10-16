package com.huawei.hwblockchain.entity;

import java.math.BigDecimal;

public class Invoice {

    private String id;//发票号
    private String purchaserName;//购买方名称
    private String sellerName;//出售方名称
    private BigDecimal totalpriceTax;//税总价
    private Integer status;//审核状态

    public Invoice() {
    }

    public Invoice(String id, String purchaserName, String sellerName, BigDecimal totalpriceTax, Integer status) {
        this.id = id;
        this.purchaserName = purchaserName;
        this.sellerName = sellerName;
        this.totalpriceTax = totalpriceTax;
        this.status = status;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPurchaserName() {
        return purchaserName;
    }

    public void setPurchaserName(String purchaserName) {
        this.purchaserName = purchaserName;
    }

    public String getSellerName() {
        return sellerName;
    }

    public void setSellerName(String sellerName) {
        this.sellerName = sellerName;
    }

    public BigDecimal getTotalpriceTax() {
        return totalpriceTax;
    }

    public void setTotalpriceTax(BigDecimal totalpriceTax) {
        this.totalpriceTax = totalpriceTax;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Invoice{" +
                "id='" + id + '\'' +
                ", purchaserName='" + purchaserName + '\'' +
                ", sellerName='" + sellerName + '\'' +
                ", totalpriceTax=" + totalpriceTax +
                ", status=" + status +
                '}';
    }
}