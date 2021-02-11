package com.jmr.practica.zuul.server.zuul_server_practica;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableEurekaClient
@EnableZuulProxy
@SpringBootApplication
public class ZuulServerPracticaApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZuulServerPracticaApplication.class, args);
    }

}
