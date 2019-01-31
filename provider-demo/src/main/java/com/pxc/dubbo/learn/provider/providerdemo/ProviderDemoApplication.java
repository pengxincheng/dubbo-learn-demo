package com.pxc.dubbo.learn.provider.providerdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource(value = "classpath:dubbo-provider.xml")
public class ProviderDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProviderDemoApplication.class, args);
    }

}

