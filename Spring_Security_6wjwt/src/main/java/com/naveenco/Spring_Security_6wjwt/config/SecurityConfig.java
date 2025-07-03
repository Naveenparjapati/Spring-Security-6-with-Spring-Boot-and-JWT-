package com.naveenco.Spring_Security_6wjwt.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;
//in this we are using UserDetailsService for verifing the user
//in this we are using UserDetailsService for verifing the user
//in this we are using UserDetailsService for verifing the user

@Configuration
//i dont want defoult security that provided by spring security
@EnableWebSecurity
public class SecurityConfig {

	@Bean
	public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
		
	return	http
	  .csrf(customizer -> customizer.disable())
      .authorizeHttpRequests(request -> request.anyRequest().authenticated())
      .httpBasic(Customizer.withDefaults())
      .sessionManagement(session -> session.sessionCreationPolicy(SessionCreationPolicy.STATELESS)).build();
		
		
		
	}
	
	@Bean
	public UserDetailsService userDetailsService(){
		
		UserDetails user1=User
				.withDefaultPasswordEncoder()
				.username("kiran")
				.password("M@kiran")
				.roles("USER")
				.build();
		
		
		UserDetails user2=User
				.withDefaultPasswordEncoder()
				.username("Aian")
				.password("Y@kiran")
				.roles("ADMIN")
				.build();
		
		
		return new InMemoryUserDetailsManager(user1,user2);
	}
			
	
}
