package com.Movies_online.Movies_Online.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Movies_online.Movies_Online.Entities.Customer;
import com.Movies_online.Movies_Online.Service.CustomerService;


@RestController
@RequestMapping("/api/customer")
public class CustomerController {

	@Autowired
	CustomerService customerService;
	
	@PostMapping("/create")
	public Customer  createCustomer(@RequestBody Customer  customer) {
		return customerService.createCustomer(customer);
	}
		
		@GetMapping("/view")
		public List<Customer> getAll() {
			return customerService.getAll();
		}
		
		@GetMapping("/find/{customerId}")
		public Customer findTicketById(@PathVariable int customerId) {
			return customerService.findCustomerById(customerId);
		}

		@PutMapping("/update/{customerId}")
		public Customer updateCustomer(@PathVariable Integer customerId, @RequestBody Customer customer) {
			return customerService.updateCustomer(customerId, customer);
			
		}
		
		
		@DeleteMapping("/delete/{customerId}")
		public String deleteCustomer(@PathVariable int customerId) {
			return customerService.deleteCustomer(customerId);
		}
	}



