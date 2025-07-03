package com.naveenco.Spring_Security_6wjwt.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.CsrfConfigurer;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
//i dont want defoult security that provided by spring security
@EnableWebSecurity
public class SecurityConfig {

	//1.customizer.disable()  this disabling the csr
	@Bean
	public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
		
	return	http
	  .csrf(customizer -> customizer.disable())
      .authorizeHttpRequests(request -> request.anyRequest().authenticated())
      .httpBasic(Customizer.withDefaults())
      .sessionManagement(session -> session.sessionCreationPolicy(SessionCreationPolicy.STATELESS)).build();
		
		//lets check how all thinks are working
		//CsrfConfigure is a lambda so we are creating 
//		Customizer<CsrfConfigurer<HttpSecurity>> custCsf=new Customizer<CsrfConfigurer<HttpSecurity>>() 
//		{
//		
//		@Override
//		public void customize(CsrfConfigurer<HttpSecurity> customizer) {
//			// TODO Auto-generated method stub
//			customizer.disable();
//			//http.authorizeHttpRequests(request -> request.anyRequest().authenticated());//without this we are not abel to see that authent formAccess to localhost was denied(then where we have to enter pass or user(even will try it with post men not work)		
////			//http.formLogin(Customizer.withDefaults());//custmize rorm  (now this will work with browser as well as post m
////			http.httpBasic(Customizer.withDefaults());
////			http.sessionManagement(session -> session.sessionCreationPolicy(SessionCreationPolicy.STATELESS));//if i will comment the form ligin on browser pop up will dis it will work with post m as well
//			
//		}
//		};
//		http.csrf(custCsf);
			
//		return http.build();
		
	}
			//}
	
}
