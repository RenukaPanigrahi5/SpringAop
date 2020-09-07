package com.example.springaop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {

    @Before("allGetters() && allCircleMethods()")
    public void LoggingAdvice(JoinPoint  joinPoint){
        System.out.println(joinPoint.getTarget());

    }



    @AfterReturning(pointcut = "args(name)", returning = "returnString")
    public void stringArgumentMethods1(String name, String returnString){
        System.out.println("String arguments called"+name);
    }

    /*@AfterThrowing("args(name)")
    public void exceptionAdvice(String name){
        System.out.println("Exception");
    }*/

    @Before("allGetters()")
    public void secondAdvice(){
        System.out.println("Second Advice Get Method called");
    }
    @Pointcut("execution(* com.example.springaop.model.Circle.*get*())")
    public void allGetters(){
    }
    @Pointcut("within(com.example.springaop.model.Circle)")
    public void allCircleMethods(){}
}
