package com.Sabu.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.fasterxml.jackson.annotation.JsonCreator.Mode;

@Controller
public class HomeController {

	@RequestMapping("home")
	public ModelAndView home(Student student) {
		
	ModelAndView mv=new ModelAndView();
	mv.addObject("sobj",student);
	mv.setViewName("home.jsp");
	return mv;	
	}
}
