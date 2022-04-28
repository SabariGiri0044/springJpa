package com.Sabu.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController1 {

	@RequestMapping("home")
	public String home() {
		System.out.println("hi Guys");
		return "home.jsp";
	}
}
