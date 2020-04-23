package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.model.User;
import com.example.demo.service.UserService;

@Controller
public class UserController {
	@Autowired
	UserService userService;
	
	

	@RequestMapping("/listUsers")
	String getUsers(Model model) {
		List<User> list = userService.getAllUsers();
	
		
		model.addAttribute("list", list);
		
		return "list";

}
}