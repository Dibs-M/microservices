package com.javabrains.movieCatalouge.Controller;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface movieCatalougeRepository  extends CrudRepository<MovieCatalougeModel, Integer>{

}
