package com.bee.beelab.API.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
public class APIController {

	@RequestMapping("api")
	public String apiTest(){
		log.info(">>>>> APIController.apiTest.executed()");
		return "api";
	}


}
