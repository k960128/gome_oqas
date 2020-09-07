package com.gome;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
//@EnableScheduling // 开启定时任务
@EnableTransactionManagement //开启事务注解
public class GomeOqasApplication {

    public static void main(String[] args) {
        SpringApplication.run(GomeOqasApplication.class, args);
    }

}
