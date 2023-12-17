package com.Movies_online.Movies_Online.Entities;

//public class UserLogin {

	//public UserLogin() {
		// TODO Auto-generated constructor stub
	//}
	
	
	
	//package com.online_store2.online_store2.Entities;

	import jakarta.persistence.Entity;
	import jakarta.persistence.GeneratedValue;
	import jakarta.persistence.GenerationType;
	import jakarta.persistence.Id;
	import jakarta.persistence.Table;
	import lombok.AllArgsConstructor;
	import lombok.Getter;
	import lombok.NoArgsConstructor;
	import lombok.Setter;

	@Getter
	@Setter
	@NoArgsConstructor
	@AllArgsConstructor
	@Entity   //for creating table
	@Table(name="UserLogin")   //specify the name of table in database

	public class UserLogin {
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
		}
	}



