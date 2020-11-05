package com.hongang.netspeed;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan("com.hongang.netspeed.dao")
public class NetspeedApplication {

    public static void main(String[] args) {
        SpringApplication.run(NetspeedApplication.class, args);
    }

}
