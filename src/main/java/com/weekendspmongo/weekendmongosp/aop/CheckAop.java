package com.weekendspmongo.weekendmongosp.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class CheckAop {

//    @Before("execution (* com.weekendspmongo.weekendmongosp.service" +
//            ".EmployeeService.saveEmp(..))")
//    public void check(){
//        System.out.println("Data added... "+System.currentTimeMillis());
//    }

//    @AfterReturning(pointcut = "execution (* com.weekendspmongo.weekendmongosp.service" +
//            ".EmployeeService.saveEmp(..))",returning = "retValue")
//    public void check(Object retValue){
//        System.out.println("Data added... "+System.currentTimeMillis());
//        String returnedValue= (String) retValue;
//        System.out.println("Returned Value is: "+returnedValue);
//    }

    //Around  --> Before and After
    @Around("execution (* com.weekendspmongo.weekendmongosp.service" +
            ".EmployeeService.saveEmp(..))")
    public Object checkAround(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("Before executed... "+System.currentTimeMillis());
        Object result=joinPoint.proceed();
        System.out.println("After Executed... "+System.currentTimeMillis());
        return result;
    }
}

// 5 Types of Advices:
// After, Before, AfterReturning, Around, AfterThrowing