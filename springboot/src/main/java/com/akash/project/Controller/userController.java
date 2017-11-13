package com.akash.project.Controller;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class userController {

	@RequestMapping(value = "/test2")
	public void start1() {
		System.out.println("in side test");
		// return "index";
	}

	@RequestMapping(value = "/test3")
	public void start2() {
		System.out.println("in side test4");
		// return "index";
	}

	@PostConstruct
	public void init() {
		System.out.println("in side init() >>");
	}

	@PreDestroy
	public void destroy() {
		System.out.println("in side init() >>");
		
	}

}
