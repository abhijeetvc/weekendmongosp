package com.weekendspmongo.weekendmongosp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@EnableAspectJAutoProxy
@SpringBootApplication
public class WeekendmongospApplication {

	public static void main(String[] args) {
		SpringApplication.run(WeekendmongospApplication.class, args);
	}

}


// AOP - Aspect Oriented Programming
// Triggers
// Terminology:
// - Aspect - It is a cross-cutting concern.
// - Advice - It is action taken by the aspect.
// - Joinpoint - It represents the execution of method.
// - PointCut - It is scenario that matches Joinpoint.

