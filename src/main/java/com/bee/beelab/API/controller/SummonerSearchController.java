package com.bee.beelab.API.controller;

import com.bee.beelab.API.service.SummonerSearchServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;

@Slf4j
@Controller
public class SummonerSearchController {

	private final SummonerSearchServiceImpl apiServiceimpl;
	@Autowired
	public SummonerSearchController(SummonerSearchServiceImpl apiServiceimpl) {
		this.apiServiceimpl = apiServiceimpl;
	}

	@RequestMapping("api")
	public String apiTest(Model model){
		log.info(">>>>> APIController.apiTest.executed()");

		HashMap<String, String> apiInfo = apiServiceimpl.searchSummoner("hide on bush");
		model.addAttribute("summoner",  apiInfo);

		return "api";
	}


}
