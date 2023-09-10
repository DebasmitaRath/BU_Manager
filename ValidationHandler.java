package com.aatral.ATS.Exception;

public class ValidationHandler extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ValidationHandler(String message) {
		super(message);
	}

	public ValidationHandler() {
		super();
	}
}
