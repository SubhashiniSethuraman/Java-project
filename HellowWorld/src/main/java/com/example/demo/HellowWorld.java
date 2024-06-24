package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController  //dwld required dependencies from spring initializer website
public class HellowWorld {
	@RequestMapping("/")  //configure pom.xml and java file
	public String greet() {
		return"Hello world this is Subha";
	}

}
