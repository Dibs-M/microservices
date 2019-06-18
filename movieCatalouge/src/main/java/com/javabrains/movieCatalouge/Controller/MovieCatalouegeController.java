package com.javabrains.movieCatalouge.Controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController 

@RequestMapping("/movieCatalouge")
public class MovieCatalouegeController {
	
	@Autowired 
	private MovieCatalougeService movieCatalougeservice;

	
	@PostMapping(value="/save")
	Map<String,Object> saveMovie( @RequestBody  MovieCatalougeModel movie,HttpServletRequest request)
	{
		Map<String,Object> response= new HashMap<>();
		String name=movie.getMovie_name();
		String desc=movie.getMovie_desc();
		long rating =movie.getMovie_rating();
		try {
		movieCatalougeservice.saveMovie(name,desc,rating);
		response.put("success", "success");
		
		}
		catch(Exception e)
		{
			
			System.out.println(e);
			response.put("failed", "failed");
		}
		
		
		return response;

	}
	
	@PostMapping(value="/getAllMovie")
	Map<String,Object> getAllMovie()
	{
		Map<String,Object> response= new HashMap<>();
		Map<String, Object> movieMap= new HashMap<>();
		
		try {
			List movies=movieCatalougeservice.getAllMovie();
			
			response.put("values", movies);
			response.put("success", "success");
			
			}
		
		catch(Exception e)
		{
			
			System.out.println(e);
			response.put("failed", "failed");
		}
		
		return response;

		
	}
	
}
	

