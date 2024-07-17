package com.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.demo.entity.UserDtls;
import com.demo.repository.UserRepository;

import jakarta.servlet.http.HttpSession;

@Controller
public class UserController 
{
	@Autowired
	private UserRepository repo;
	
	
	
	
	@GetMapping("/")
	public String home() {
		return "index.html";
		
	}
	
	@PostMapping("/register")
	public String register(@ModelAttribute UserDtls u,HttpSession session)
	{
		System.out.println(u);
		
		repo.save(u);
		session.setAttribute("message", "user added sucessfully.....");
		
		return "redirect:/";
	}

}
