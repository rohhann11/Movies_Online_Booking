package com.Movies_online.Movies_Online.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Movies_online.Movies_Online.Entities.Ticket;
import com.Movies_online.Movies_Online.Repositories.TicketRepository;
import com.Movies_online.Movies_Online.Service.TicketService;
@Service
public class TicketServiceImpl implements TicketService {
	
@Autowired
TicketRepository ticketRepository;

	//public TicketServiceImpl() {
		//return ticketRepository.save();
		// TODO Auto-generated constructor stub
	//}

	@Override
	public Ticket createTicket(Ticket ticket) {
		return ticketRepository.save(ticket);
		// TODO Auto-generated method stub
		//return null;
	}

	@Override
	public List<Ticket> getAll() {
	return ticketRepository.findAll();
	
		
	}

	@Override
	public Ticket findTicketById(int ticketId) {
		return ticketRepository.findById(ticketId).get();
	}

	@Override
	public Ticket updateTicket(int ticketId, Ticket ticket) {
		Ticket t=ticketRepository.findById(ticketId).get();
		t.setTicketId(ticket.getTicketId());
		t.setmovieName(ticket.getmovieName());
		t.setTicketPrice(ticket.getTicketPrice());
			return ticketRepository.save(t);
	}

	
	//public String deleteTicket(int TicketId) {
		// TODO Auto-generated method stub
		//return null;
//	}
	@Override
	public String deleteTicket(int ticketId) {
		// TODO Auto-generated method stub
		Ticket t = ticketRepository.findById(ticketId).get();
		ticketRepository.delete(t);
		return "We Have Been Deleted Sucessfully!!!";
	}

	//@Override
	//public Ticket assignToCart(int ticketId, int Id) {
		// TODO Auto-generated method stub
		//return null;
	}

	//@Override
	//public String assignToTicket(int ticketId, int Id) {
		// TODO Auto-generated method stub
	//	return null;
	


