package com.mao.swagger;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * Hello world!
 *
 * @author panghu
 */
@SpringBootApplication(scanBasePackages = "com.mao.swagger",exclude= {DataSourceAutoConfiguration.class})
public class DemoApp {

    public static void main(String[] args){
        SpringApplication.run(DemoApp.class, args);
    }

}