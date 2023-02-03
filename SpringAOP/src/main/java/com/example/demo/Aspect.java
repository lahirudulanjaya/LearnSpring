package com.example.demo;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;


/**
 * Example of Aspect for Calculate the Execution time for the service methods.
 */
@org.aspectj.lang.annotation.Aspect
@Component
@EnableAspectJAutoProxy
public class Aspect {
    @Pointcut("within(@org.springframework.stereotype.Service *)")
    public void repositoryClassMethods() {
    }

    @Around("repositoryClassMethods()")
    public Object measureMethodExecutionTime(ProceedingJoinPoint joinPoint)
            throws Throwable {
        long start = System.nanoTime();
        Object returnValue = joinPoint.proceed();
        long end = System.nanoTime();
        String methodName = joinPoint.getSignature().getName();
        System.out.println(
                "Execution of " + methodName + " took " +
                        TimeUnit.NANOSECONDS.toMillis(end - start) + " ms");
        return returnValue;
    }
}
