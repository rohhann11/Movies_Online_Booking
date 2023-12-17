package com.Movies_online.Movies_Online.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Movies_online.Movies_Online.Entities.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {

}
