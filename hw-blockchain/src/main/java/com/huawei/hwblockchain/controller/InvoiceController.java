package com.huawei.hwblockchain.controller;

import com.huawei.hwblockchain.common.Result;
import com.huawei.hwblockchain.common.StatusCode;
import com.huawei.hwblockchain.entity.Invoice;
import com.huawei.hwblockchain.service.InvoiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/invoice")
public class InvoiceController {

    @Autowired
    private InvoiceService invoiceService;

    /**
     * 查询全部数据
     *
     * @return
     */
    @GetMapping(value = "/findAll",name = "查询所有**")
    public Result findAll() {
        List<Invoice> invoiceList = invoiceService.findAll();
        return new Result(true, StatusCode.OK, "查询成功", invoiceList);
    }

    /***
     * 根据ID查询数据
     * @param id
     * @return
     */
    @GetMapping("/{id}")
    public Result findById(@PathVariable String id) {
        Invoice invoice = invoiceService.findById(id);
        return new Result(true, StatusCode.OK, "查询成功", invoice);
    }


    /***
     * 新增数据
     * @param invoice
     * @return
     */
    @PostMapping("/add")
    public Result add(Invoice invoice) {

        invoiceService.add(invoice);
        return new Result(true, StatusCode.OK, "添加成功");
    }
    /*
     *//***
     * 申请上链
     * @param invoiceIds
     * @return
     *//*
    @PostMapping
    public Result add(@RequestBody String[] invoiceIds) {

        invoiceService.add(invoiceIds);
        return new Result(true, StatusCode.OK, "添加成功");
    }*/
}
