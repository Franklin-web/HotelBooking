package com.franklin.HotelBooking.exception;

public class HotelNotFoundException extends RuntimeException{

	
	
	private static final long serialVersionUID = 542651920697864644L;

	public HotelNotFoundException(String message) {
		super(message);
	}
	

}
