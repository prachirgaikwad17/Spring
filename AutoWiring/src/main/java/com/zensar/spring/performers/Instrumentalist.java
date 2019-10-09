package com.zensar.spring.performers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.zensar.spring.instruments.Instrument;

@Component("Prachi")
public class Instrumentalist implements Performer {
	@Autowired             //automatically creates obj of instrument
	@Qualifier("piano")
	private Instrument instrument;   //complex property
	@Value("All we know")
	private String song;      //simple property
	
	@Override
	public void perform() {
		// TODO Auto-generated method stub
		System.out.println("Instrumentalist is playing a song "+song);
		instrument.play();
	}

}
