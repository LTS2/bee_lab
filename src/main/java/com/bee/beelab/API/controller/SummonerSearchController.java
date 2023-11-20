package com.bee.beelab.API.controller;

import com.bee.beelab.API.service.SummonerSearchServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import java.util.HashMap;

@Slf4j
@Controller
public class SummonerSearchController {

	private final SummonerSearchServiceImpl apiServiceimpl;
	@Autowired
	public SummonerSearchController(SummonerSearchServiceImpl apiServiceimpl) {
		this.apiServiceimpl = apiServiceimpl;
	}

	
	@GetMapping("/")
	public String main(){
	    log.info(">>>>> SummonerSearchController.main.executed()");
	    return "summoner-search/main";
	}
	/**
	 * 소환사 검색 기능 */
	@GetMapping("summoners/kr/{summonerName}")
	public String apiTest(Model model, @PathVariable String summonerName){
		log.info(">>>>> APIController.apiTest.executed()");

		HashMap<String, String> apiInfo = apiServiceimpl.searchSummoner(summonerName);
		model.addAttribute("summoner",  apiInfo);

		return "summoner-search/summoner-search";
	}


}
