package com.zensar.spring.performers;

import java.util.Enumeration;
import java.util.Properties;


//import com.zensar.spring.instruments.Instrument;

public class Instrumentalist implements Performer {
	private Properties instrumentSongProps;

	public Properties getInstrumentSongProps() {
		return instrumentSongProps;
	}

	public void setInstrumentSongProps(Properties instrumentSongProps) {
		this.instrumentSongProps = instrumentSongProps;
	}

	@Override
	public void perform() {
		// TODO Auto-generated method stub
		System.out.println("Instrumentalist is playing songs");
		Enumeration instruments=instrumentSongProps.keys();
		while (instruments.hasMoreElements()) {
			String instrumentName = (String) instruments.nextElement();
			String song=instrumentSongProps.getProperty(instrumentName);
			System.out.println(song+" by "+instrumentName);
			
		}
	}
	
	
}