package com.demo.study.java8.jdk8.completableFuture;

public class ResponseVO {
	private String data;
	private boolean success;
	private String errorCode;
	private String msg;
	
	public ResponseVO(boolean success, String msg) {
		this.success = success;
		this.msg = msg;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public boolean isSuccess() {
		return success;
	}
	public void setSuccess(boolean success) {
		this.success = success;
	}
	public String getErrorCode() {
		return errorCode;
	}
	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	@Override
	public String toString() {
		return "ResponseVO [data=" + data + ", success=" + success + ", errorCode=" + errorCode + ", msg=" + msg + "]";
	}
	
}
