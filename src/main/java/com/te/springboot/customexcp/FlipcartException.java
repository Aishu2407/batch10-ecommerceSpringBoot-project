package com.te.springboot.customexcp;

public class FlipcartException extends RuntimeException{

	public FlipcartException(String message) {
		super(message);
	}
}