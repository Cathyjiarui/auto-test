package com;

import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@MapperScan("com.puhui.mapper")
public class AutoTestApplication {

    private  static  final Logger LOGGER = LoggerFactory.getLogger(AutoTestApplication.class);

    public static void main(String[] args) {
        try {
            SpringApplication.run(AutoTestApplication.class, args);
            LOGGER.info("DemoApplication server start!!!");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}