package com.singleton;

public class SingletonBean {
	private String message;

	public void getMessage() {
		System.out.println("your message:"+message);;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
}
