package com.test.util;

public class ResponseVO {

	private boolean isData;

	private Object payload;

	private String message;

	private boolean isException;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public boolean isData() {
		return isData;
	}

	public void setData(boolean isData) {
		this.isData = isData;
	}

	public Object getPayload() {
		return payload;
	}

	public void setPayload(Object payload) {
		this.payload = payload;
	}

	public boolean isException() {
		return isException;
	}

	public void setException(boolean isException) {
		this.isException = isException;
	}

}
