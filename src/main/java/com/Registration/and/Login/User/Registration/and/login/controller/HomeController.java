package com.Registration.and.Login.User.Registration.and.login.controller;
import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import com.Registration.and.Login.User.Registration.and.login.entity.User;
import com.Registration.and.Login.User.Registration.and.login.repository.UserRepo;
import com.Registration.and.Login.User.Registration.and.login.service.UserService;
import jakarta.servlet.http.HttpSession;

@Controller
public class HomeController {
	@Autowired
	private UserService userService;
	@Autowired
	private UserRepo userRepo;
	@ModelAttribute
	public void commonUser(Principal p,Model m)
	{
		if(p!=null)
		{
			String email=p.getName();
			User user=userRepo.findByEmail(email);
			m.addAttribute("user",user);
		}
	}
	@GetMapping("/")
	public String index()
	{
		return "index";
	}
	@GetMapping("/register")
	public String register()
	{
		return "register";
	}
	@GetMapping("/signin")
	public String login()
	{
		return "login";
	}
	@GetMapping("/user/profile")
	public String profile(Principal p,Model m)
	{
		String email=p.getName();
		User user=userRepo.findByEmail(email);
		m.addAttribute("user",user);
		return "profile";
	}
	@GetMapping("/user/home")
	public String home()
	{
		return "home";
	}
	@PostMapping("/saveUser")
	public String saveUser(@ModelAttribute User user,HttpSession session)
	{
		//System.out.println(user);
		User u=userService.saveUser(user);
		if(u!=null)
		{
			session.setAttribute("msg", "Registered Successfully");
			//System.out.println("Save Success");
		}
		else
		{
//			System.out.println("Error in Server");
			session.setAttribute("msg", "Something wrong in Server");
		}
		return "redirect:/register";
	}

}
