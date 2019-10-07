package com.zensar.spring.performers;

import com.zensar.spring.poems.Poem;

public class PoeticJuggler extends Juggler {
	private Poem poem;
	
	public PoeticJuggler() {
		// TODO Auto-generated constructor stub
		System.out.println("No arg constructor of PoeticJuggler");
	}

	public PoeticJuggler(int beanBags, Poem poem) {
		super(beanBags);
		this.poem = poem;
		System.out.println("Parameterized constructor of PoeticJuggler");
	}

	@Override
	public void perform() {
		// TODO Auto-generated method stub
		super.perform();
		System.out.println("While resiting a poem...");
		poem.resite();
	}
	
	
}
