package com.Movies_online.Movies_Online.Entities;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="Ticket")



public class Ticket {

private int ticketPrice;

@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private int ticketId;
private String movieName;

public int getTicketId() {
	return ticketId;
}
public void setTicketId(int ticketId) {
	this.ticketId = ticketId;
	}

public void setTicketPrice(int ticketPrice) {
	this.ticketPrice=ticketPrice;
}

public int getTicketPrice() {
	return ticketPrice;}
	
	public String getmovieName() {
		return movieName;
	}
	public void setmovieName(String movieName) {
		this.movieName = movieName;}
	



	//public Ticket() {
		// TODO Auto-generated constructor stub
	//}

}
