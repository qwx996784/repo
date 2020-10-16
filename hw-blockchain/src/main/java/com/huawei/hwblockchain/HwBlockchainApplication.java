package com.huawei.hwblockchain;

import com.huawei.hwblockchain.common.IdWorker;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@MapperScan("com.huawei.hwblockchain.mapper")
public class HwBlockchainApplication {

    public static void main(String[] args) {
        SpringApplication.run(HwBlockchainApplication.class, args);
    }

    @Bean
    public IdWorker idWorker() {
        return new IdWorker(1,1);
    }
}
