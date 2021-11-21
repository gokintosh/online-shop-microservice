package xyz.gokulnair.productservive;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ProductServiveApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProductServiveApplication.class, args);
    }

}
