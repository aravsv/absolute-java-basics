package com.javatut.section6.exception;

public class CustomException extends Exception {
	
	private int errorCode;
	private String errorMessage;
	
	public CustomException(int errorCode, String errorMessage) {
		super();
		this.errorCode = errorCode;
		this.errorMessage = errorMessage;
	}

	public int getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(int errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	@Override
	public String toString() {
		return "CustomException [errorCode=" + errorCode + ", errorMessage="
				+ errorMessage + "]";
	}
	
	

}
