package com.corexfin.exception;

import java.sql.Timestamp;

import com.corexfin.dto.response.SuccessResponse;

public class ErrorMessage extends SuccessResponse{

	public ErrorMessage() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ErrorMessage(String message, boolean status, int httpStatus, String path, Timestamp timestamp) {
		super(message, status, httpStatus, path, timestamp);
		// TODO Auto-generated constructor stub
	}
	
	
	
	

}
