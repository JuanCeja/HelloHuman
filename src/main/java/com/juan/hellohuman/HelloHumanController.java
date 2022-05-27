package com.juan.hellohuman;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloHumanController {
	@RequestMapping("/")
	public String index(@RequestParam(value="name", required=false)String name,
						@RequestParam(value="lastName", required=false) String lastName) {
		if (name == null & lastName == null) {
			return "Hello Human";
		} else if(lastName == null) {
			return "Hello " + name;
		} else {
			return "Hello" + " " + name + " " + lastName;
		}
	}
}
