package com.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.demo.model.DoneTask;
import com.demo.model.Tasks;
import com.demo.repo.DoneTasks;
import com.demo.repo.TasksRepo;

@Controller
public class SeeTasks {
@Autowired
TasksRepo ts;
@Autowired
DoneTasks ds;
@RequestMapping("view")
public String See(Model m)
{
	
	 List<Tasks>t=ts.findAll();
	 
	 m.addAttribute("tasks", t);
	 System.out.println(t);
	return "ViewTask";
}

@RequestMapping("ViewDoneTasks")
public String See1(Model m1)
{
	
	 List<DoneTask>t=ds.findAll();
	 
	 m1.addAttribute("Donetasks", t);
	 System.out.println(t);
	return "DoneTasks";
}



}
