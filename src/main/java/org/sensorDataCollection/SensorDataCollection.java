package org.sensorDataCollection;
import org.sensorDataCollection.controller.NonEncodedURIRequestHandler;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.List;

//@Configuration
//@EnableWebMvc

@Service
@RestController
@SpringBootApplication
public class SensorDataCollection
{
//        implements WebMvcConfigurer {
//
//    @Override
//    public void addArgumentResolvers(List<HandlerMethodArgumentResolver> argumentResolvers) {
//        System.out.println("I am in main class");
//        argumentResolvers.add(new NonEncodedURIRequestHandler());
//    }
    public static void main(String[] args) {
        SpringApplication.run(SensorDataCollection.class, args);
    }
}