package com.Movies_online.Movies_Online.Service;

import java.util.List;

//import com.Movies_online.Movies_Online.Entities.Movies;
import com.Movies_online.Movies_Online.Entities.Ticket;

public interface TicketService {
	
	Ticket createTicket(Ticket ticket);
	List<Ticket> getAll();
	Ticket findTicketById(int ticketId);
	
	
	Ticket updateTicket(int ticketId, Ticket ticket);
	String deleteTicket(int ticketId);
	//String assignToTicket(int ticketId,int Id);
//    String reserveMovie(Costumer costumer);

}
