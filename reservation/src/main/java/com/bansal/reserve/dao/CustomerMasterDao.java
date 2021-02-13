package com.bansal.reserve.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.bansal.reserve.model.CustomerMaster;

@Repository
public interface CustomerMasterDao extends CrudRepository<CustomerMaster, Integer> {

	

}
