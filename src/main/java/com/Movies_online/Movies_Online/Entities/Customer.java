package com.Movies_online.Movies_Online.Entities;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name ="Customer")

public class Customer {
	   private String costName;
	   @Id
	   @GeneratedValue(strategy=GenerationType.IDENTITY)
	   private int Id;
	   private String contactNo;
	   private int Total_amount;
	   
	
   public String getCostName() {
		return costName;
	}
	public void setCostName(String costName) {
		this.costName = costName;
	}
	public int getId() {
		return Id;
	}
	public void setId(int userId) {
		this.Id = userId;
	}
	public String getContactNo() {
		return contactNo;
	}
	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}
	
@OneToMany(mappedBy="customer",cascade=CascadeType.PERSIST)
@JsonManagedReference
private List<Cart> cart;


public List<Cart> getCart() {
	return cart;
}
public void setCart(List<Cart> cart) {
	this.cart = cart;
}
public int getTotal_amount() {
	return Total_amount;
}
public void setTotal_amount(int total_amount) {
	Total_amount = total_amount;
}
   
}

