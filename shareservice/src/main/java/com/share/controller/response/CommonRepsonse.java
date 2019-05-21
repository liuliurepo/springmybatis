package com.share.controller.response;

public class CommonRepsonse<T> {
	
	private static String SUCCESS_STATUS = "OK";
	
	private static String FAIL_STATUS = "OK";
	
	private String state;
	
	private String reason;
	
	private T result;

	public CommonRepsonse() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public void successResponse (final T result) {
		this.state = SUCCESS_STATUS;
		this.result = result;
	}
	
	public void failResponse (final Exception e) {
		this.state = FAIL_STATUS;
		this.reason = "Request url fail, Reason is " + e;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public T getResult() {
		return result;
	}

	public void setResult(T result) {
		this.result = result;
	}
	
	
}
