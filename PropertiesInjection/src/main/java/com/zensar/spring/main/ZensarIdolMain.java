package com.zensar.spring.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zensar.spring.performers.Performer;

public class ZensarIdolMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx=new ClassPathXmlApplicationContext("performers.xml");
		Performer p=ctx.getBean("Prachi",Performer.class);
		p.perform();
		
	
		
	}

}







/*
 Working Directory: D:\Prachi\Assignments\spring\PropertiesInjection
Gradle user home: C:\Users\Zensar123\.gradle
Gradle Distribution: Gradle wrapper from target build
Gradle Version: 5.6.1
Java Home: C:\Program Files\Java\jdk1.8.0_111
JVM Arguments: None
Program Arguments: None
Build Scans Enabled: false
Offline Mode Enabled: false
Gradle Tasks: run

> Task :compileJava
> Task :processResources
> Task :classes

> Task :run
Instrumentalist is playing songs
On my way by guitar
All we know by piano
Seneorita by drum

BUILD SUCCESSFUL in 1s
3 actionable tasks: 3 executed

 */
