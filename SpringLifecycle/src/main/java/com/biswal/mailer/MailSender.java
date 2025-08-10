package com.biswal.mailer;

import org.springframework.stereotype.Component;

@Component
public class MailSender {
	String email;
	int size;
	public MailSender() {
		super();
		System.out.println("FROM CONSTRUCTOR");
		// TODO Auto-generated constructor stub
	}
	
	public void setup() {
		System.out.println("FROM INIT");
	}
	public void clean() {
		System.out.println("FROM DESTROY");
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		System.out.println("FROM SETTER");
		this.email = email;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	
	@Override
	public String toString() {
		return "MailSender [email=" + email + ", size=" + size + "]";
	}
	
}
