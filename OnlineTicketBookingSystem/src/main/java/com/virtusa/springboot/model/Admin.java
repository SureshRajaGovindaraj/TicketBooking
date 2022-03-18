package com.virtusa.springboot.model;

import javax.persistence.*;

@Entity
@Table(name="Admin_added_movie_info")
public class Admin {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String movieName;
	private float rating;
	private  int amount;
	private String description;
	private String actors;
	public Admin(Long id, String movieName, float rating, int amount, String description, String actors) {
		super();
		this.id = id;
		this.movieName = movieName;
		this.rating = rating;
		this.amount = amount;
		this.description = description;
		this.actors = actors;
	}
	public Admin() {

	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public float getRating() {
		return rating;
	}
	public void setRating(float rating) {
		this.rating = rating;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getActors() {
		return actors;
	}
	public void setActors(String actors) {
		this.actors = actors;
	}
	
	

}
