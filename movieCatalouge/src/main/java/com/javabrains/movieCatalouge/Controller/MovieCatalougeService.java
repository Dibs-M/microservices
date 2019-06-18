package com.javabrains.movieCatalouge.Controller;

import java.util.List;

public interface MovieCatalougeService {

	void saveMovie(String name, String desc, long rating)throws Exception;

	List getAllMovie()throws Exception;

}
