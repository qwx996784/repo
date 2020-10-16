package com.huawei.hwblockchain.entity;

import java.math.BigDecimal;

public class Blockchain {

    private String id;//申请号
    private String invoice_id;//发票号
    private String purchaserName;//购买方名称
    private String sellerName;//出售方名称
    private BigDecimal totalpriceTax;//税总价

    public Blockchain() {
    }

    public Blockchain(String id, String invoice_id, String purchaserName, String sellerName, BigDecimal totalpriceTax) {
        this.id = id;
        this.invoice_id = invoice_id;
        this.purchaserName = purchaserName;
        this.sellerName = sellerName;
        this.totalpriceTax = totalpriceTax;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getInvoice_id() {
        return invoice_id;
    }

    public void setInvoice_id(String invoice_id) {
        this.invoice_id = invoice_id;
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

    @Override
    public String toString() {
        return "Blockchain{" +
                "id='" + id + '\'' +
                ", invoice_id='" + invoice_id + '\'' +
                ", purchaserName='" + purchaserName + '\'' +
                ", sellerName='" + sellerName + '\'' +
                ", totalpriceTax=" + totalpriceTax +
                '}';
    }
}