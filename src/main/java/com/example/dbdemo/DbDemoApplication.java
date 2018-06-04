package com.example.dbdemo;

import com.example.dbdemo.repository.OrderRepository;
import com.example.dbdemo.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

@EnableAutoConfiguration
@SpringBootApplication
public class DbDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DbDemoApplication.class, args);
    }


    @Bean
    public CommandLineRunner commandLineRunner(ApplicationContext applicationContext) {

        return args -> {
//            UserRepository userRepository = applicationContext.getBean(UserRepository.class);
//            userRepository.findAll();

            OrderRepository orderRepository = applicationContext.getBean(OrderRepository.class);
            orderRepository.fetchAllWithUser(Arrays.asList(1L, 2L, 3L));
            System.out.println("Hello world, " + applicationContext.getApplicationName());
        };

    }

}
