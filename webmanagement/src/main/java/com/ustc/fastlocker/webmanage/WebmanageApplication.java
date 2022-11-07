package com.ustc.fastlocker.webmanage;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.ustc.fastlocker.webmanage.mapper")
public class WebmanageApplication {

    public static void main(String[] args) {
        SpringApplication.run(WebmanageApplication.class, args);
    }

}
