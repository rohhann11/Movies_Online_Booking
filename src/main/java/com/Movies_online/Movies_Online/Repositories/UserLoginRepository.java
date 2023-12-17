package com.Movies_online.Movies_Online.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.Movies_online.Movies_Online.Entities.UserLogin;

public interface UserLoginRepository extends JpaRepository<UserLogin , Long> {
	
	
	
@Query(value="select * from User_login ul where ul.email =(:query)", nativeQuery=true)
	
	UserLogin findbyemailid(String query);

}
