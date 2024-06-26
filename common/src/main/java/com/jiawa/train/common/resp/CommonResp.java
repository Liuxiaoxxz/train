package com.jiawa.train.common.resp;

public class CommonResp<T> {
	private boolean success = true;
	private String message;

	private T content;

	public CommonResp(){
	}

	public CommonResp(T content) {
		this.content = content;
	}

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public T getContent() {
		return content;
	}

	public void setContent(T content) {
		this.content = content;
	}
}
