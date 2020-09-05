package com.wzj.hivue.aspect;

import org.aspectj.lang.annotation.*;

@Aspect
public class MyAspect {
    @Pointcut("execution(* com.wzj.hivue.aspect.impl.UserServiceImpl.printUser(..))")
    public void pointCut(){
    }
    @Before("pointCut()")
    public void before(){
        System.out.println("Before...");
    }
    @After("pointCut()")
    public void after(){
        System.out.println("After...");
    }
    @AfterReturning("pointCut()")
    public void afterReturning(){
        System.out.println("After returning");
    }
    @AfterThrowing("pointCut()")
    public void afterThrowing(){
        System.out.println("after throwing");
    }
}
