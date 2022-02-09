package com.gxz.demo.config;

import com.gxz.demo.pojo.User;
import com.gxz.demo.service.UserService;
import com.gxz.demo.service.UserServiceImpl;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("com.gxz.demo")
@EnableAspectJAutoProxy // 重要，启动AOP切面自动代理
public class AppConfig {

    @Bean
    public UserService userService(){
        return new UserServiceImpl();
    }

    @Bean
    public User user(){
        return new User();
    }
}
