package com.Movies_online.Movies_Online.Entities;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonIgnoreType;
//import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.annotation.Generated;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
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
@Table(name="Cart")

public class Cart {
          //private String movieList;
	   @Id
	   @GeneratedValue(strategy=GenerationType.IDENTITY)
       private int Id;
	   private int movieId;
	   private int totalPrice;
	      private int no_of_tickets;
		public int getMovieId() {
			return movieId;
		}
		public void setMovieId(int movieId) {
			this.movieId = movieId;
		}
		public int getTotalPrice() {
			return totalPrice;
		}
		public void setTotalPrice(int totalPrice) {
			this.totalPrice = totalPrice;
		}
		public int getNo_of_tickets() {
			return no_of_tickets;
		}
		public void setNo_of_tickets(int no_of_tickets) {
			this.no_of_tickets = no_of_tickets;
		}
		
		public int getId() {
			return Id;
		}
		public void setId(int id) {
			Id = id;
		}

		@ManyToOne(cascade=CascadeType.ALL,fetch=FetchType.LAZY)
		@JsonBackReference
		private Customer customer;
		public Customer getCustomer() {
			return customer;
		}
		public void setCustomer(Customer customer) {
			this.customer = customer;
		}
	      
	      
	      
     
	//@OneToMany(mappedBy="Id",cascade=CascadeType.PERSIST)
//	@ManyToOne(cascade=CascadeType.ALL, fetch=FetchType.EAGER)
	//@JsonIgnoreProperties
	//private Ticket movieName;
	//private List<Cart>Cart;
	
      
      

	//public Cart() {
		// TODO Auto-generated constructor stub
	

}
