package com.Movies_online.Movies_Online.Service;

import java.util.List;

import com.Movies_online.Movies_Online.Entities.Customer;
//import com.Movies_online.Movies_Online.Entities.Movies;

public interface CustomerService  {
	
	//public interface MoviesService {
		Customer createCustomer(Customer customer);
		List<Customer> getAll();
		Customer findCustomerById(int customerId);
		Customer updateCustomer(int customerId,Customer customer);
		String deleteCustomer(int customerId);
		//String assignToMovie(int ticketId,int Id);
}


