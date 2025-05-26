package com.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class HomeController {

	
	@RequestMapping("/")
	public String home()
	{
		return "Home";
	}
	
	@RequestMapping("/add")
	public String Add()
	{
		return "Add";
	}
}
