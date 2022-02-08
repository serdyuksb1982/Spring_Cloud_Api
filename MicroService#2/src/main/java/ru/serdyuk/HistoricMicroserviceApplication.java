package ru.serdyuk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


@SpringBootApplication
@EnableEurekaClient
public class HistoricMicroserviceApplication {
    public static void main(String[] args) {
        SpringApplication.run(HistoricMicroserviceApplication.class, args);
    }

}
