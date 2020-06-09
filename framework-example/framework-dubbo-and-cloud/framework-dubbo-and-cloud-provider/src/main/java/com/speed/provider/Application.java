package com.speed.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author jasonbiao
 * @date 2020-05-06 16:06
 * Description: <p>
 *
 * </p>
 */
@EnableDiscoveryClient
@SpringBootApplication
@EnableAutoConfiguration
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @RestController
    public class EchoController {

        @GetMapping("/echo")
        public void echo() {
            System.out.println("echo1...");
        }
    }
}
