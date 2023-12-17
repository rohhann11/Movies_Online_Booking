package com.Movies_online.Movies_Online.Service;

import com.Movies_online.Movies_Online.Entities.AdminLogin;

public interface AdminLoginService {
	String signup(AdminLogin adminLogin);
	String login(String email, String password );
	
	

}
