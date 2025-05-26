package com.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.demo.model.Tasks;
import com.demo.repo.TasksRepo;

@Controller
public class AddTasks {
	@Autowired
     TasksRepo ts;
	
	@RequestMapping("/addtasks")
	public String add(@ModelAttribute("Tasks") Tasks t)
	{
		System.out.println(t.getWork());
		ts.save(t);
		return "home";
	}

}
