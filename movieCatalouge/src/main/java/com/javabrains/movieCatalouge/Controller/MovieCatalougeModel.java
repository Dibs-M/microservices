package com.javabrains.movieCatalouge.Controller;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;



@Entity
@Table(name="movie_Catalouge")
public class MovieCatalougeModel implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id")
	private int id;
	
	@Column(name="movie_name")
	@NotNull
	private String movie_name;
	
	@Column(name="movie_desc")
	private String movie_desc;
	
	@Column(name="movie_rating")
	private long movie_rating;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMovie_name() {
		return movie_name;
	}

	public void setMovie_name(String movie_name) {
		this.movie_name = movie_name;
	}

	public String getMovie_desc() {
		return movie_desc;
	}

	public void setMovie_desc(String movie_desc) {
		this.movie_desc = movie_desc;
	}

	public long getMovie_rating() {
		return movie_rating;
	}

	public void setMovie_rating(long movie_rating) {
		this.movie_rating = movie_rating;
	}
	
}
