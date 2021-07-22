package com.reindorius.log;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

public class Log implements MethodBeforeAdvice {
    @Override
    public void before(Method method, Object[] objects, Object o) throws Throwable {
        /**
         * method: 要执行的目标对象的方法
         * objects: 参数
         * o: 目标对象
         */
        System.out.println(o.getClass().getName() + " is running method '" + method.getName() + "'");
    }
}
