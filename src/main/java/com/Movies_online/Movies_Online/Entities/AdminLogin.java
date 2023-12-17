package com.Movies_online.Movies_Online.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

//public class AdminLogin {

	
	@Getter
	@Setter
	@NoArgsConstructor
	@AllArgsConstructor
	@Entity   //for creating table
	@Table(name="AdminLogin")   //specify the name of table in database

	public class AdminLogin {
		@Id //primary key
		 @GeneratedValue(strategy=GenerationType.IDENTITY)  
		private Long id;
		
		private String email;
		private String password;
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
			}}




