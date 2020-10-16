package com.huawei.hwblockchain.service;

import com.huawei.hwblockchain.entity.Invoice;

import java.util.List;

public interface InvoiceService {


    List<Invoice> findAll();

    Invoice findById(String id);

    void add(Invoice invoice);
}
