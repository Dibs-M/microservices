package com.bansal.reserve.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bansal.reserve.model.CustomerMaster;
import com.bansal.reserve.service.CustomerMasterService;

@Controller
public class CutomerMasterController {

	
	@Autowired
	private CustomerMasterService customerMasterService;
	
	@RequestMapping(value="/customerbooking")
	public String saveBookingDetails(@Valid @ModelAttribute("customerMaster") CustomerMaster customerMaster, BindingResult result, Model model) {
		String status="";
		if(!result.hasErrors()) {
			status=customerMasterService.savebookingDetails(customerMaster);
		}
		if(status.equals("success")) {return "index";}
		return "index";
	}
}
