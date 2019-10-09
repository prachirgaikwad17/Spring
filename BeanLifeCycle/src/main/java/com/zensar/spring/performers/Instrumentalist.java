package com.zensar.spring.performers;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import com.zensar.spring.instruments.Instrument;

public class Instrumentalist implements Performer,BeanNameAware,BeanFactoryAware,ApplicationContextAware,InitializingBean,DisposableBean {
	private Instrument instrument;
	private String song;
	private String name;
	
	public Instrumentalist() {
		// TODO Auto-generated constructor stub
		System.out.println("Instrumentalist created");
	}
	
	
	
	public Instrument getInstrument() {
		return instrument;
	}



	public void setInstrument(Instrument instrument) {
		this.instrument = instrument;
		System.out.println("Instrument is set");
	}



	public String getSong() {
		return song;
	}



	public void setSong(String song) {
		this.song = song;
		System.out.println("Song is set");
	}



	@Override
	public void perform() {
		// TODO Auto-generated method stub
		System.out.println("Instrumentalist "+name+" is playing a song "+song);
		instrument.play();
	}



	@Override
	public void setBeanName(String name) {
		// TODO Auto-generated method stub
		this.name=name;
		System.out.println("BeanName is set");
	}



	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("BeanFactory is set");
	}



	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("ApplicationContext is set");
	}



	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("afterPropertiesSet");
		//instrument.tune();
	}

	public void tuneInstrument()  //userdefined method
	{
		System.out.println("Custom init-method");
		instrument.tune();
	}

	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("destroy");
		instrument.clean();
	}
	
	public void cleanInstrument()
	{
		System.out.println("Custom destroy-method");
	}
	
}
