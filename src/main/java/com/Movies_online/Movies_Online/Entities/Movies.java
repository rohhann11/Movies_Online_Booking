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
@Table(name ="Movies")

public class Movies {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int movieId;
	private int avail_tick;
	
	public int getMovieId() {
		return movieId;
		
		
	}
	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}
	private String movieType;
	private int moviePrice;
	public String getMovieType() {
		return movieType;
	}
	public void setMovieType (String movieType) {
		this.movieType = movieType;
	}
	public int getMoviePrice() {
		return moviePrice;
	}
	public void setMoviePrice(int moviePrice) {
		this.moviePrice = moviePrice;
	}
	public int getAvail_tick() {
		return avail_tick;
	}
	public void setAvail_tick(int avail_tick) {
		this.avail_tick = avail_tick;
	}
}