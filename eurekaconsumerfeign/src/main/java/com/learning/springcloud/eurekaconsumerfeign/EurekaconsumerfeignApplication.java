package com.learning.springcloud.eurekaconsumerfeign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableHystrix
@EnableFeignClients
@SpringBootApplication
public class EurekaconsumerfeignApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaconsumerfeignApplication.class, args);
    }

}
