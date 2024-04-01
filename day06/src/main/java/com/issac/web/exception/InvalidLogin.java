package com.issac.web.exception;

public class InvalidLogin extends RuntimeException {

	private static final long serialVersionUID = -406267363589342941L;

	public InvalidLogin(String message) {
		super(message);
	}

	public InvalidLogin(Throwable cause) {
		super(cause);
	}

}
