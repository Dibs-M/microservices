package com.bansal.reserve.serviceimpl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bansal.reserve.dao.CustomerMasterDao;
import com.bansal.reserve.model.CustomerMaster;
import com.bansal.reserve.service.CustomerMasterService;

@Service
public class CustomerMasterServiceImpl implements CustomerMasterService {

	@Autowired
	private CustomerMasterDao customerMasterDao;
	
	@Override
	@Transactional
	public String savebookingDetails(CustomerMaster customerMaster) {
		
		 customerMasterDao.save(customerMaster);
		 return "success";
	}

}
