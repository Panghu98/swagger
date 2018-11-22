package com.mao.swagger;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * Hello world!
 *
 * @author panghu
 */
@Slf4j
@SpringBootApplication(scanBasePackages = "com.mao.swagger",exclude= {DataSourceAutoConfiguration.class})
public class DemoApp {


    public static void main(String[] args){
        log.info("程序开始执行");
        SpringApplication.run(DemoApp.class, args);
    }

}