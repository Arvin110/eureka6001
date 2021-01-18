package com.arvin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableEurekaClient     //启动Eureka客户端
@EnableFeignClients     //启动Feign客户端
@SpringBootApplication
public class UsersConsumer8888Application {

    public static void main(String[] args) {
        SpringApplication.run(UsersConsumer8888Application.class, args);
    }

}
