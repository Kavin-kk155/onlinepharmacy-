package com.jsp.onlinepharmacya3.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
public class AdminEmailNotValidException extends RuntimeException {
	
	private String message;
	
	public AdminEmailNotValidException(String message) {
		// TODO Auto-generated constructor stub
		super();
		this.message = message;
	}

	

}
