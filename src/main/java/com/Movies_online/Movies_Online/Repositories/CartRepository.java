package com.Movies_online.Movies_Online.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Movies_online.Movies_Online.Entities.Cart;

public interface CartRepository extends JpaRepository<Cart ,Integer>{

}
