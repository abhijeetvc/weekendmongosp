package com.weekendspmongo.weekendmongosp.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class CheckAop {

    @Before("execution (* com.weekendspmongo.weekendmongosp.service" +
            ".EmployeeService.saveEmp(..))")
    public void check(){
        System.out.println("Data added... "+System.currentTimeMillis());
    }
}

// 5 Types of Advices:
// After, Before, AfterReturning, Around, AfterThrowing