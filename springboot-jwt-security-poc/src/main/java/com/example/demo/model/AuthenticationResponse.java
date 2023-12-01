package com.example.demo.model;

import org.springframework.stereotype.Component;

@Component
public class AuthenticationResponse {

	private String jwt;
	
	public AuthenticationResponse() {
	}

	public String getJwt() {
		return jwt;
	}

	public AuthenticationResponse(String jwt) {
		this.jwt = jwt;
	}
	
}
