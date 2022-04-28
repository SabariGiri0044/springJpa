package com.Sabu.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Controller1 {
	@RequestMapping("emp")
	public ModelAndView employee(Employee emp) {
		ModelAndView mv=new ModelAndView();
		mv.addObject("obj",emp);
		mv.setViewName("emp");
		return mv;
	}
}
