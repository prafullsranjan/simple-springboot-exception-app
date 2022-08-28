/**
 * 
 */
package com.prafullranjan.code.controller;

import java.io.IOException;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prafullranjan.code.exception.InvalidInputException;

/**
 * AppController
 * 
 * @author Prafull
 */
@RestController
public class AppController {

	@RequestMapping("/getUserDetails/{id}")
	public String getUserDetails(@PathVariable Integer id) throws InvalidInputException {
		String user = "Prafull";
		if (id / 2 == 1) {
			return user;
		} else if (id == 0) {
			throw new ArithmeticException("Oops!");
		} else {
			throw new InvalidInputException(new InvalidInputException(), "ID not valid: "+id);
		}
	}
}
