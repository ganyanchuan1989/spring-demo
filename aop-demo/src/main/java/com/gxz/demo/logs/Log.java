package com.gxz.demo.logs;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

public class Log implements MethodBeforeAdvice {
    @Override
    public void before(Method method, Object[] args, Object target) throws Throwable {
        System.out.println(target.getClass().getName()+"类的"+method.getName()+"方法被调用");
        System.out.println("调用前打印日志");
    }
}
