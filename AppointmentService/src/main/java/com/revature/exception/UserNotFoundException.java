package com.revature.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class UserNotFoundException extends RuntimeException {

	  private static final long serialVersionUID = -2329992299469419407L;

	  public UserNotFoundException(String message) {
	    super(message);
	  }
	}