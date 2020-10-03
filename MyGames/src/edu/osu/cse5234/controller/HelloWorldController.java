package edu.osu.cse5234.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

import javax.servlet.http.*;

@Controller
@RequestMapping("/hello")

public class HelloWorldController {
	@RequestMapping(method = RequestMethod.GET)
	public void printHello(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.getWriter().println("Hello World Spring MVC!");
	}
	
	
	@RequestMapping(path= "/new", method = RequestMethod.GET)
	public String printHelloNew(HttpServletRequest request, HttpServletResponse response) throws IOException {
		return "HelloJSP";
	}
	
}
