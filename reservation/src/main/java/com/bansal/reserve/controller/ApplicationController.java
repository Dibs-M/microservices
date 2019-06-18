package com.bansal.reserve.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApplicationController {
	
	@RequestMapping({"/fallback-response"})
	public String sendResponse() {
		return "This is from reservation fallback";
	}
	@RequestMapping({"/login"})
	public String loginpage() {
		return "login";
	}
	
	@RequestMapping({ "/", "/home" ,})
	public String homepage() {
		return "index";
	}

	@RequestMapping(value = "/saveBookingDetails")
	public String saveBookingDetails(Model model) {
		return "index";
	}
	@RequestMapping(value = "/saveBookinails")
	public String tyuiiooo(Model model) {
		return "index";
	}

	@RequestMapping(value = { "/about", "/blog", "/booking", "/contact", "/elements" ,"/index"}, method = RequestMethod.GET)
	public String pageRedirect(HttpServletRequest request) {
		String pageURI = request.getServletPath();
		String pageRedirect = "";
		if (pageURI.equals("/about"))
			pageRedirect = "about";
		else if (pageURI.equals("/blog"))
			pageRedirect = "blog";
		else if (pageURI.equals("/booking"))
			pageRedirect = "booking";
		else if (pageURI.equals("/contact"))
			pageRedirect = "contact";
		else if (pageURI.equals("/elements"))
			pageRedirect = "contact";
		else if (pageURI.equals("/index"))
			pageRedirect = "index";
		return pageRedirect;
	}

}
