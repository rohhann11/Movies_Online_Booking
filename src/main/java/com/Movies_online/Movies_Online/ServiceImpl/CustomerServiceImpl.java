package com.Movies_online.Movies_Online.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Movies_online.Movies_Online.Entities.Customer;
import com.Movies_online.Movies_Online.Entities.Movies;
import com.Movies_online.Movies_Online.Entities.Ticket;
import com.Movies_online.Movies_Online.Repositories.CustomerRepository;
import com.Movies_online.Movies_Online.Service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService {

	//public CustomerServiceImpl() {
		// TODO Auto-generated constructor stub
	//}
@Autowired
CustomerRepository customerRepository;

	@Override
	public Customer createCustomer(Customer customer) {
		return customerRepository.save(customer);
	}
		

	@Override
	public List<Customer> getAll() {
		return customerRepository.findAll();
	}

	@Override
	public Customer findCustomerById(int customerId) {
		return customerRepository.findById(customerId).get();
	}

	@Override
	public Customer updateCustomer(int customerId, Customer customer) {
		Customer c = customerRepository.findById(customerId).get();
		c.setCostName(customer.getCostName());
		c.setContactNo(customer.getContactNo());
		//m.setMovieId(movies.getMovieId());
		return customerRepository.save(c);
	}

	@Override
	public String deleteCustomer(int customerId) {
		// TODO Auto-generated method stub
		Customer c = customerRepository.findById(customerId).get();
		customerRepository.delete(c);
		return "We Have Been Deleted Sucessfully!!!";}
}

