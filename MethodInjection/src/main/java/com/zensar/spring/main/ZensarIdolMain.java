package com.zensar.spring.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zensar.spring.performers.Performer;

public class ZensarIdolMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx=new ClassPathXmlApplicationContext("performers.xml");
		Performer p=ctx.getBean("magicianRam",Performer.class);
		p.perform();
		
	
		
	}

}






/*
Working Directory: D:\Prachi\Assignments\spring\MethodInjection
Gradle user home: C:\Users\Zensar123\.gradle
Gradle Distribution: Gradle wrapper from target build
Gradle Version: 5.6.1
Java Home: C:\Program Files\Java\jdk1.8.0_111
JVM Arguments: None
Program Arguments: None
Build Scans Enabled: false
Offline Mode Enabled: false
Gradle Tasks: run

> Task :compileJava UP-TO-DATE
> Task :processResources
> Task :classes

> Task :run
Magician says abra ka dabra
A Tiger

BUILD SUCCESSFUL in 1s
3 actionable tasks: 2 executed, 1 up-to-date

Working Directory: D:\Prachi\Assignments\spring\MethodInjection
Gradle user home: C:\Users\Zensar123\.gradle
Gradle Distribution: Gradle wrapper from target build
Gradle Version: 5.6.1
Java Home: C:\Program Files\Java\jdk1.8.0_111
JVM Arguments: None
Program Arguments: None
Build Scans Enabled: false
Offline Mode Enabled: false
Gradle Tasks: run

> Task :compileJava UP-TO-DATE
> Task :processResources
> Task :classes

> Task :run
Magician says abra ka dabra
A beautiful girl

BUILD SUCCESSFUL in 1s
3 actionable tasks: 2 executed, 1 up-to-date

 */



