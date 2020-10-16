package com.huawei.hwblockchain.mapper;

import com.huawei.hwblockchain.entity.Invoice;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface InvoiceMapper {

    List<Invoice> findAll();

    Invoice findById(String id);

    void add(Invoice invoice);
}
