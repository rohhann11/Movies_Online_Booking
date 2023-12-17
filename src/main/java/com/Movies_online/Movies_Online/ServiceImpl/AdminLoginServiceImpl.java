package com.Movies_online.Movies_Online.ServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Movies_online.Movies_Online.Entities.AdminLogin;
import com.Movies_online.Movies_Online.Repositories.AdminLoginRepository;
import com.Movies_online.Movies_Online.Service.AdminLoginService;

@Service
public class AdminLoginServiceImpl implements AdminLoginService{
	
	@Autowired
	AdminLoginRepository adminLoginRepository;

	@Override
	public String signup(AdminLogin adminLogin) {
	adminLoginRepository.save(adminLogin);
		return "Account has been created";
	}

	@Override
	public String login(String email, String password) {
		AdminLogin adminLogin=adminLoginRepository.findbyemailid(email);
		// TODO Auto-generated method stub
		if (adminLogin !=null) {
			if(adminLogin.getPassword().equals(password))
			return "you are welcome";
			
			return "Invalid password";
	}
	else
		return "kindly create account";
                           }}
			
			
		
		
	


	
	
