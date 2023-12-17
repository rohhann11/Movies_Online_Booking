/*package com.Movies_online.Movies_Online.Controller;

public class TicketController {

	public TicketController() {
		// TODO Auto-generated constructor stub
	}

}*/



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

import com.Movies_online.Movies_Online.Entities.Movies;
import com.Movies_online.Movies_Online.Entities.Ticket;
import com.Movies_online.Movies_Online.Service.MoviesService;
import com.Movies_online.Movies_Online.Service.TicketService;

@RestController
@RequestMapping("/api/ticket")
public class TicketController {

	@Autowired
	TicketService ticketService;
	
	@PostMapping("/create")
	public Ticket  createTicket(@RequestBody Ticket  ticket) {
		return ticketService.createTicket(ticket);
	}
		
		@GetMapping("/view")
		public List<Ticket> getAll() {
			return ticketService.getAll();
		}
		
		@GetMapping("/findbyid/{ticketId}")
		public Ticket findTicketById(@PathVariable int ticketId) {
			return ticketService.findTicketById(ticketId);
		}

		@PutMapping("/update/{ticketId}")
		public Ticket updateTicket(@PathVariable Integer ticketId, @RequestBody Ticket ticket) {
			return ticketService.updateTicket(ticketId, ticket);
			//return "hi";
		}
		
		
		@DeleteMapping("/delete/{ticketId}")
		public String deleteTicket(@PathVariable int ticketId) {
			return ticketService.deleteTicket(ticketId);
		}
	}



