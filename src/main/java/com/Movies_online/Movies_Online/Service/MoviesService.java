package com.Movies_online.Movies_Online.Service;

import java.util.List;

import com.Movies_online.Movies_Online.Entities.Cart;
import com.Movies_online.Movies_Online.Entities.Customer;
import com.Movies_online.Movies_Online.Entities.Movies;



public interface MoviesService {
	Movies createMovies(Movies movies);
	List<Movies> getAll();
	Movies findMoviesById(int moviesId);
	Movies updateMovies(int moviesId,Movies movies);
	String deleteMovies(int moviesId);
	//String assignToMovie(int ticketId,int Id);
	String BookingTicket(Customer customer);
	List<Cart> Bookingdetails(int Id );
	
//    String reserveMovie(Costumer costumer);
}
