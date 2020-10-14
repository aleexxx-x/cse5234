package edu.osu.cse5234.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;



@Controller
@RequestMapping("/")

public class HomeController {
	@RequestMapping(method = RequestMethod.GET)
	public String forwardToHome(HttpServletRequest request, HttpServletResponse response) {
		return "Home";
	}
	
	@RequestMapping(path = "/aboutUs", method = RequestMethod.GET)
	public String forwardToAboutUs(HttpServletRequest request, HttpServletResponse response) {
		return "AboutUs";
	}
	
	@RequestMapping(path = "/contactUs", method = RequestMethod.GET)
	public String forwardToContactUs(HttpServletRequest request, HttpServletResponse response) {	
		return "ContactUs";
	}
}
