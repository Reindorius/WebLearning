package com.reindorius.diy;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

//Use annotation to implement AOP
@Aspect //标注一个切面
public class AnnotationPointCut {
    @Before("execution(* com.reindorius.service.UserServiceImpl.*(..))")
    public void before()
    {
        System.out.println("Before implementing... ====");
    }

    @After("execution(* com.reindorius.service.UserServiceImpl.*(..))")
    public void after()
    {
        System.out.println("=====After implementing");
    }

    //在环绕增强中可以给定一个参数，代表我们要获取处理的点
    @Around("execution(* com.reindorius.service.UserServiceImpl.*(..))")
    public void around(ProceedingJoinPoint joinPoint) throws Throwable
    {
        System.out.println("before around");

        //获取签名
        Signature signature = joinPoint.getSignature();
        System.out.println(signature);

        //执行方法
        Object proceed = joinPoint.proceed();

        System.out.println("after around");
    }
}
