package com.Movies_online.Movies_Online.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Movies_online.Movies_Online.Entities.Cart;
import com.Movies_online.Movies_Online.Entities.Customer;
import com.Movies_online.Movies_Online.Entities.Movies;
import com.Movies_online.Movies_Online.Exception.MoviesException;
import com.Movies_online.Movies_Online.Repositories.CartRepository;
import com.Movies_online.Movies_Online.Repositories.CustomerRepository;
import com.Movies_online.Movies_Online.Repositories.MovieRepository;
import com.Movies_online.Movies_Online.Service.MoviesService;

@Service
public class MoviesServiceimpl implements MoviesService {

	@Autowired
	MovieRepository movieRepository;
	@Autowired
	CartRepository cartRepository;
@Autowired
CustomerRepository customerRepository;

	
	@Override
	public Movies createMovies(Movies movies) {
		return movieRepository.save(movies);
		}

	@Override
	public List<Movies> getAll() {
		return movieRepository.findAll();
	}

	@Override
	public Movies findMoviesById(int moviesId) {
		return movieRepository.findById(moviesId).get();

	}

	@Override
	public Movies updateMovies(int moviesId, Movies movies) {
		Movies m = movieRepository.findById(moviesId).get();
		m.setMovieType(movies.getMovieType());
		m.setMoviePrice(movies.getMoviePrice());
		m.setAvail_tick(movies.getAvail_tick());
		return movieRepository.save(m);
	}

	@Override
	public String deleteMovies(int moviesId) {
		Movies m1 = movieRepository.findById(moviesId).get();
		movieRepository.delete(m1);
		return "Record has been deleted";
	}

	//@Override
//	public String assignToMovie(int ticketId, int Id) {
		// TODO Auto-generated method stub
		//return null;
	//}

	@Override
	public String BookingTicket(Customer customer) {
		List<Cart> cart= customer.getCart();
		int sum=0;
		for(Cart i:cart) {
			Movies movie=movieRepository.findById(i.getMovieId()).get();

				try{
					if(i.getNo_of_tickets()> movie.getAvail_tick())
						
						throw new MoviesException("seats not available,HOusefull"); 
				}
				
				catch(MoviesException e) {
					
              return e.getMessage();
				}
			i.setTotalPrice(i.getNo_of_tickets()*movie.getMoviePrice());
			i.setCustomer(customer);
			cartRepository.save(i);
			movie.setAvail_tick(movie.getAvail_tick()-i.getNo_of_tickets());
		
			
			movieRepository.save(movie);
			sum=sum+i.getTotalPrice();
			
		}
		
		customer.setTotal_amount(sum);
		customerRepository.save(customer);
		return"successfully, tickets have been booked";
		
		
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Cart> Bookingdetails(int Id) {
		Customer customer=customerRepository.findById(Id).get();
	  return customer.getCart();
	}

}
