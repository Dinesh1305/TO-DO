package com.demo.Controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.demo.model.DoneTask;
import com.demo.model.Tasks;
import com.demo.repo.DoneTasks;
import com.demo.repo.TasksRepo;

@Controller
public class RemoveTasks {
	
@Autowired
DoneTasks dt;

@Autowired
TasksRepo ts;
@RequestMapping("remove")
public String Remove(@ModelAttribute("id") int id)
{
	
	
	Optional<Tasks> t=ts.findById(id);
	
	Tasks t1=t.get();
	   DoneTask doneTask = new DoneTask();
	   doneTask.setId(t1.getId());
	   doneTask.setWork(t1.getWork());
	   doneTask.setCreatedAt(t1.getCreatedAt());
	   ts.deleteById(t1.getId());
dt.save(doneTask);
	
	
	
	return "Home";
}
}
