package com.ebao.cloud;

import com.insuremo.appframework.annotation.AppFrameworkBasedApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableFeignClients
@EnableAsync
@AppFrameworkBasedApplication
public class App {
    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }

}
