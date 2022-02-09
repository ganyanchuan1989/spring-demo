package com.gxz.demo.logs;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.aop.aspectj.MethodInvocationProceedingJoinPoint;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Log {
    @Pointcut("execution(* com.gxz.demo.service.UserServiceImpl.*(..))")
    public void pointcut(){
        System.out.println("out point");
    }

    @Before("pointcut()")
    public void beforeAdvice(JoinPoint joinPoint){
        System.out.println(joinPoint);
//        System.out.println(target.getClass().getName()+"类的"+method.getName()+"方法被调用");
        System.out.println("调用前打印日志");
    }

    @After("pointcut()")
    public void afterAdvice(JoinPoint joinPoint){
        System.out.println("类名"+joinPoint.getTarget().getClass().getName());
        System.out.println("方法名"+joinPoint.getSignature().getName());
        System.out.println("调用后打印日志");
    }
}
