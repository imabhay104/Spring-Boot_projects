package com.project.ScheduleMaker.schedule.exception;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(InavlidDataException.class)
	public ResponseEntity<ErrorResponse> InavalidDateException(InavlidDataException exc)
	{
		ErrorResponse er = new ErrorResponse(exc.getMessage(),LocalDateTime.now(),HttpStatus.BAD_REQUEST.value());
		return new ResponseEntity<ErrorResponse>(er,HttpStatus.BAD_REQUEST);
	}
	@ExceptionHandler(Exception.class)
	public ResponseEntity<ErrorResponse> handleAllExceptions(Exception exc) {
	    ErrorResponse er = new ErrorResponse(
	        exc.getMessage(), 
	        LocalDateTime.now(), 
	        HttpStatus.INTERNAL_SERVER_ERROR.value()
	    );
	    return new ResponseEntity<>(er, HttpStatus.INTERNAL_SERVER_ERROR);
	}


}
