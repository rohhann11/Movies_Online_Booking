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

import com.Movies_online.Movies_Online.Entities.Cart;
import com.Movies_online.Movies_Online.Entities.Customer;
import com.Movies_online.Movies_Online.Entities.Movies;
import com.Movies_online.Movies_Online.Service.MoviesService;

@RestController
@RequestMapping("/api/movies")
public class MoviesController {

	@Autowired
	MoviesService moviesService;
	
	@PostMapping("/create")
	public Movies createMovies(@RequestBody Movies movies) {
		return moviesService.createMovies(movies);
	}
		
		@GetMapping("/view")
		public List<Movies> getAll() {
			return moviesService.getAll();
		}
		
		@GetMapping("/findbyid/{moviesId}")
		public Movies findMoviesById(@PathVariable int moviesId) {
			return moviesService.findMoviesById(moviesId);
		}

		@PutMapping("/update/{moviesId}")
		public Movies updateMovies(@PathVariable Integer moviesId, @RequestBody Movies movies) {
			return moviesService.updateMovies(moviesId, movies);
			//return "hi";
		}
		@PostMapping("/tobook")
		public String BookingTicket(@RequestBody Customer customer) {
			return moviesService.BookingTicket(customer);
		}
		
		
		@DeleteMapping("/delete/{moviesId}")
		public String deleteMovies(@PathVariable int moviesId) {
			return moviesService.deleteMovies(moviesId);
			
			}
		
		@GetMapping("/Bookingdetails/{Id}")
		public List<Cart>Bookingdetails(@PathVariable int Id)
		{
			return moviesService.Bookingdetails(Id);
			
			
		}
		
	}


