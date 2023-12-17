package com.Movies_online.Movies_Online.Service;

import com.Movies_online.Movies_Online.Entities.UserLogin;

public interface UserLoginService {
	String signup(UserLogin userlogin);
	String login(String email, String password );

}
