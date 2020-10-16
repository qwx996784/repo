package com.huawei.hwblockchain.service.impl;

import com.huawei.hwblockchain.common.IdWorker;
import com.huawei.hwblockchain.entity.Invoice;
import com.huawei.hwblockchain.mapper.InvoiceMapper;
import com.huawei.hwblockchain.service.InvoiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public class InvoiceServiceImpl implements InvoiceService {

    @Autowired
    private InvoiceMapper invoiceMapper;
    @Autowired
    private IdWorker idWorker;

    @Override
    public List<Invoice> findAll() {
        return invoiceMapper.findAll();
    }

    @Override
    public Invoice findById(String id) {
        return invoiceMapper.findById(id);
    }

    @Override
    public void add(Invoice invoice) {
        invoice.setId(idWorker.nextId()+"");
        invoice.setPurchaserName("深圳市XX有限公司");
        invoice.setSellerName("深圳市AA有限公司");
        invoice.setTotalpriceTax(BigDecimal.valueOf(2000.00));
        invoice.setStatus(1);
        invoiceMapper.add(invoice);
    }
}
