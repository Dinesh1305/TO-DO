package com.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.demo.model.CompleteProblem;
import com.demo.model.Leetcode;
import com.demo.repo.CompleteProblemRepo;
import com.demo.repo.LeetCodeRepo;

import jakarta.transaction.Transactional;
@Controller
public class AddLeetcode {

	@Autowired
	LeetCodeRepo lr;
	
	@Autowired
	CompleteProblemRepo cp;
	
	@RequestMapping("addLeetCode")
	public String add(@ModelAttribute Leetcode l)
	{
	lr.save(l);
	return "Home";
		
	}
	
	
	@RequestMapping("GetLeetCode")
	public String getAll(Model model)
	{
		
		//System.out.println("hdhd");
     List<Leetcode>list=lr.findAll();
     model.addAttribute("problems", list);
     return "ViewLeetCode";
	}
	@Transactional
	@RequestMapping("removeProblem")
	public String remove(@ModelAttribute() Leetcode ls )
	{
		
		CompleteProblem k=new CompleteProblem();
		
		k.setName(ls.getName());
		k.setUrl(ls.getUrl());
		
	    cp.save(k);
		lr.deleteByName(ls.getName());
		return "home";
	}
	
	
	@RequestMapping("CompleteProblem")
	public String completeproblem(Model m )
	{
		
		List<CompleteProblem>list=cp.findAll();
		m.addAttribute("problems",list);
		
		return "CompleteProblem";
	}
}
