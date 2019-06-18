package com.javabrains.movieCatalouge.Controller;

import java.util.List;
import java.util.Stack;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class MovieCatalougeServiceImpl  implements MovieCatalougeService{

	@Autowired 
	private movieCatalougeRepository movieCatalougeJpa;
	
	//@Autowired  MovieCatalougeModel movieModel;
	MovieCatalougeModel movieModel = new MovieCatalougeModel();
	@Override
	@Transactional
	public void saveMovie(String name, String desc, long rating) {
		
		try {
		movieModel.setMovie_name(name);
		movieModel.setMovie_rating(rating);
		movieModel.setMovie_desc(desc);
		movieCatalougeJpa.save(movieModel);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}

	@Override
	public List getAllMovie() throws Exception {
		// TODO Auto-generated method stub
		
		
		return (List) movieCatalougeJpa.findAll();
	}

}
