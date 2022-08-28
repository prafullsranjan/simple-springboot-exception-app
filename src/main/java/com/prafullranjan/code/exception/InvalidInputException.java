/**
 * 
 */
package com.prafullranjan.code.exception;

import java.io.IOException;

/**
 * InvalidInputException
 * 
 * @author Prafull
 */
public class InvalidInputException extends IOException {

	private static final long serialVersionUID = 1L;

	public InvalidInputException() {
		super();
	}
	
	public InvalidInputException(InvalidInputException ex, String msg) {
		super(msg);
	}
}
