package com.arwizon.exception;

public class MyException extends Exception {
	
	
	String detailMsg;
	
	public MyException(String msg) {
		this.detailMsg = msg;
	}
	@Override
	public String getMessage() {
		return detailMsg;
	}
}
