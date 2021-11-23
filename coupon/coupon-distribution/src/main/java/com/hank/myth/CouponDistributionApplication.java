package com.hank.myth;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
@EntityScan({"com.hank.myth.model"})
@MapperScan("com.hank.myth.mapper")
public class CouponDistributionApplication {
    public static void main(String[] args) {
        SpringApplication.run(CouponDistributionApplication.class, args);
    }
}
