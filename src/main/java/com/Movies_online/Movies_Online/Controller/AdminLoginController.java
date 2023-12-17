package com.Movies_online.Movies_Online.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Movies_online.Movies_Online.Entities.AdminLogin;
import com.Movies_online.Movies_Online.Service.AdminLoginService;

//public class AdminLoginController {

	//public AdminLoginController() {
		// TODO Auto-generated constructor stub

@RestController
@RequestMapping("/api/adminlogin")
public class AdminLoginController {
@Autowired
AdminLoginService adminLoginService;

@PostMapping("/signup")
public String signup(@RequestBody AdminLogin adminLogin)
{
	return adminLoginService.signup(adminLogin);
}

@GetMapping("/search/{email}/{password}")
public ResponseEntity<String> login(@PathVariable String email, @PathVariable String password)
{
	return ResponseEntity.ok(adminLoginService.login(email, password));
}
}