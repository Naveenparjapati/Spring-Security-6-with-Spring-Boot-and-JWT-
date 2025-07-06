package com.naveenco.Spring_Security_6wjwt.service;

import org.springframework.stereotype.Service;

@Service
public class JWTService {

	public String generateToken() {
		// TODO Auto-generated method stub
		
		return "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiIxMjM0NTY3ODkwIiwibmFtZSI6IkpvaG4gRG9lIiwiYWRtaW4iOnRydWUsImlhdCI6MTUxNjIzOTAyMn0.KMUFsIDTnFmyG3nMiGM6H9FNFUROf3wh7SmqJp-QV30";//usint jwt website for generating token
	}

}
