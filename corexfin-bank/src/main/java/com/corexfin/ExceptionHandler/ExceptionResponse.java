package com.corexfin.ExceptionHandler;

import java.sql.Timestamp;
import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.corexfin.exception.BankNotFoundException;

import com.corexfin.exception.ErrorMessage;

import jakarta.servlet.http.HttpServletRequest;



/*
 * 
 * @author:Raushan Srivastava
 *  Created the global exception handle which handle the run time error 
 *  and generate the meaning full message
 */
@ControllerAdvice
public class ExceptionResponse {
	
	
	 @ResponseBody
	 @ExceptionHandler({BankNotFoundException.class})
	 @ResponseStatus(value=HttpStatus.NOT_FOUND)
	  public ErrorMessage handleException(BankNotFoundException e, HttpServletRequest request) {
		  String uri=request.getRequestURI();
		  /**@author raushan.srivastava
		   * (message, status, httpStatus, path, timestamp)
		    */
		  return new ErrorMessage(e.getMessage(),false,HttpStatus.NOT_FOUND.value(),uri,Timestamp.valueOf(LocalDateTime.now()));
	  }
	 

	  

}
