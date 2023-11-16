package com.bee.beelab.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
public class HomeController {
	
	@RequestMapping("/test")
	public String test(){
		log.info(">>>>> HomeController.test.executed()");
		return "test";
	}

}
