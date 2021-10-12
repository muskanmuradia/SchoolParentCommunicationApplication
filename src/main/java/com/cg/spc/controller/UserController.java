package com.cg.spc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.spc.entities.User;
import com.cg.spc.service.IUserService;

@RestController
@RequestMapping("api/user")
public class UserController {
	@Autowired
	private IUserService userService;
	
	public UserController(IUserService userService) {
		super();
		this.userService = userService;
	}

	@PostMapping("/addnewuser")
	public User addNewUser(@RequestBody User u) {
		return userService.addNewUser(u);
	}
	
	@PostMapping("/signin")
	public User signIn(@RequestBody User u) {
		return userService.signIn(u);
	}
	
	@PostMapping("/signout")
	public User signOut(@RequestBody User u) {
		return userService.signOut(u);
	}

}
