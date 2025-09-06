package com.example.movies;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;
//import lombok.Data;

//@Data
@Table("movies")
public class Movie {
    @Id
    private Long id;
    private String title;
    private String genre;
    private Integer year;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public Integer getYear() {
		return year;
	}
	public void setYear(Integer year) {
		this.year = year;
	}
	public Movie(Long id, String title) {
		super();
		this.id = id;
		this.title = title;
	}
    
    
}

