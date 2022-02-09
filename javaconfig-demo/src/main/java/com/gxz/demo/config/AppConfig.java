package com.gxz.demo.config;

import com.gxz.demo.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan("com.gxz.demo")
@Import(AppConfig2.class)
public class AppConfig {
    @Bean
    public User getUser(){
        return new User();
    }
}
