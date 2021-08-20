package com.learncode;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Helloworld {
	@RequestMapping("/")

	public String show() {
		
		return"Helloworld";
	}
}
