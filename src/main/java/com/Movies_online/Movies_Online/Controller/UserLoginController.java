package com.Movies_online.Movies_Online.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Movies_online.Movies_Online.Entities.UserLogin;
import com.Movies_online.Movies_Online.Service.UserLoginService;

//public class UserLoginController {
		
	@RestController
	@RequestMapping("/api/userlogin")
	public class UserLoginController {
	@Autowired
	UserLoginService userLoginService;

	@PostMapping("/signup")
	public String signup(@RequestBody UserLogin userLogin)
	{
		return userLoginService.signup(userLogin);
	}

	@GetMapping("/search/{email}/{password}")
	public ResponseEntity<String> login(@PathVariable String email, @PathVariable String password)
	{
		return ResponseEntity.ok(userLoginService.login(email, password));
	}
	}


	//public UserLoginController() {
		// TODO Auto-generated constructor stub
	


