package com.gxz.demo.config;

import com.gxz.demo.pojo.Dog;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig2 {
    @Bean
    public Dog getDog(){
        return new Dog();
    }


}
