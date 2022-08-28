/**
 * 
 */
package com.prafullranjan.code.exception;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.ServletWebRequest;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

/**
 * @author Prafull
 *
 */

@ControllerAdvice
public class ControllerExceptionHandler extends ResponseEntityExceptionHandler {

	@ExceptionHandler(InvalidInputException.class)
	public ResponseEntity<ErrorMessage> resourceNotFoundException(InvalidInputException ex, WebRequest request) {
		ErrorMessage message = new ErrorMessage(HttpStatus.NOT_FOUND.value(), new Date(), ex.getMessage(),
				((ServletWebRequest)request).getRequest().getRequestURI().toString(), HttpStatus.NOT_FOUND.name());

		return new ResponseEntity<ErrorMessage>(message, HttpStatus.NOT_FOUND);
	}

	@ExceptionHandler(Exception.class)
	public ResponseEntity<ErrorMessage> globalExceptionHandler(Exception ex, WebRequest request) {
		ErrorMessage message = new ErrorMessage(HttpStatus.NOT_FOUND.value(), new Date(), ex.getMessage(),
				((ServletWebRequest)request).getRequest().getRequestURI().toString(), HttpStatus.NOT_FOUND.name());

		return new ResponseEntity<ErrorMessage>(message, HttpStatus.INTERNAL_SERVER_ERROR);
	}

}