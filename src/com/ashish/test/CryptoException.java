/** @author Ashishkumar Gupta */
package com.ashish.test;

public class CryptoException extends Exception {

	private static final long serialVersionUID = -2993202618450328296L;

	public CryptoException() {
	}

	public CryptoException(String message, Throwable throwable) {
		super(message, throwable);
	}
}
