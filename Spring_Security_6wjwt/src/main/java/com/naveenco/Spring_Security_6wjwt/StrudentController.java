package com.naveenco.Spring_Security_6wjwt;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StrudentController {
      //we are tring some hard coded values this will display as output
	private List<Student> students=new ArrayList<Student>(List.of(
			
			new Student(1,"navin",90),
			new Student(2,"Kiran",80)
			));
	
	
	@GetMapping("/students")
	public List<Student>  getStudent()
	{
		return students;
	}
}  
