package com.reindorius.log;

import org.springframework.aop.AfterAdvice;
import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

public class LogAfter implements AfterReturningAdvice {
    @Override
    public void afterReturning(Object o, Method method, Object[] objects, Object o1) throws Throwable {
        /**
         * o: 返回值
         */
        System.out.println("执行了" + method.getName() + " | 返回结果: " + o);
    }
}
