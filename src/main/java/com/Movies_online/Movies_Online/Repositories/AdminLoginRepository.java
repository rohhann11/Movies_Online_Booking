package com.Movies_online.Movies_Online.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.Movies_online.Movies_Online.Entities.AdminLogin;


public interface AdminLoginRepository extends JpaRepository<AdminLogin, Long> {
	
	
	
@Query(value="select * from Admin_login ul where ul.email =(:query)", nativeQuery=true)
	
	AdminLogin findbyemailid(String query);

}
