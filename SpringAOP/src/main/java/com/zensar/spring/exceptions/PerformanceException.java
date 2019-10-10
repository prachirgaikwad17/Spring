package com.zensar.spring.exceptions;

public class PerformanceException extends Exception {
	private String errorMessage;
	
	public PerformanceException() {
		// TODO Auto-generated constructor stub
		errorMessage="Sorry!Performance is not satisfactory";
	}

	public PerformanceException(String errorMessage) {
		super();
		this.errorMessage = errorMessage;
	}

	@Override
	public String toString() {
		return "PerformanceException [errorMessage=" + errorMessage + "]";
	}
	
	
}
