package com.teammartin.giflib;

import javafx.application.Application;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;


/**
 * Created by Martin H on 24-03-2017.
 */
@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan
public class AppConfig extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(AppConfig.class, args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(Application.class);
    }
}
