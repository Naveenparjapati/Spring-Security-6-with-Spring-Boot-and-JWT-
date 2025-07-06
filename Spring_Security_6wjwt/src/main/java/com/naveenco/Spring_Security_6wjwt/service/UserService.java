package com.naveenco.Spring_Security_6wjwt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.naveenco.Spring_Security_6wjwt.model.Users;
import com.naveenco.Spring_Security_6wjwt.repository.UserRepo;

@Service
public class UserService {
      @Autowired 
	 UserRepo userRepo;
      
      private BCryptPasswordEncoder encoder=new BCryptPasswordEncoder(12);
     
      
	public Users register(Users user) {
   	     user.setPassword(encoder.encode(user.getPassword()));
		return userRepo.save(user);
    }
}
