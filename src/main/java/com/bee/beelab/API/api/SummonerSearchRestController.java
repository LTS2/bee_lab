package com.bee.beelab.API.api;

import com.bee.beelab.API.service.SummonerSearchServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;


@Slf4j
@RestController
@RequestMapping("/summoner")
public class SummonerSearchRestController {

	private final SummonerSearchServiceImpl apiServiceimpl;


	public SummonerSearchRestController(SummonerSearchServiceImpl apiServiceimpl) {
		this.apiServiceimpl = apiServiceimpl;
	}

	@GetMapping("/{summonerName}")
	public ResponseEntity<HashMap<String, String>> getSummonerInfo(@PathVariable("summonerName") String summonerName){
	    log.info(">>>>> SummonerController.String.executed()");

		HashMap<String, String> summonerInfo = apiServiceimpl.searchSummoner(summonerName);
	    return ResponseEntity.ok(summonerInfo);
	}
}
