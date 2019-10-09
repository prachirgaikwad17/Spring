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
		
		Performer p1=ctx.getBean("Arman",Performer.class);
		p1.perform();
		
		Performer p2=ctx.getBean("Rucha",Performer.class);
		p2.perform();
		
	}

}
