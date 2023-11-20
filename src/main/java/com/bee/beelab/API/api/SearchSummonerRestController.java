package com.bee.beelab.API.api;

import com.bee.beelab.API.service.SearchSummonerServiceImpl;
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
public class SearchSummonerRestController {

	private final SearchSummonerServiceImpl searchSummonerServiceImpl;


	public SearchSummonerRestController(SearchSummonerServiceImpl searchSummonerServiceImpl) {
		this.searchSummonerServiceImpl = searchSummonerServiceImpl;
	}

	@GetMapping("/{summonerName}")
	public ResponseEntity<HashMap<String, String>> getSummonerInfo(@PathVariable("summonerName") String summonerName){
	    log.info(">>>>> SearchSummonerRestController.getSummonerInfo.executed()");

		HashMap<String, String> summonerInfo = searchSummonerServiceImpl.searchSummoner(summonerName);
	    return ResponseEntity.ok(summonerInfo);
	}
}
