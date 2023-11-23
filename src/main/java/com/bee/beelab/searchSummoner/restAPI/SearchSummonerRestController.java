package com.bee.beelab.searchSummoner.restAPI;

import com.bee.beelab.searchSummoner.model.entity.SearchSummonerDTO;
import com.bee.beelab.searchSummoner.service.SearchSummonerServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@Slf4j
@RestController
@RequestMapping("/summoner")
public class SearchSummonerRestController {

	private final SearchSummonerServiceImpl searchSummonerServiceImpl;


	public SearchSummonerRestController(SearchSummonerServiceImpl searchSummonerServiceImpl) {
		this.searchSummonerServiceImpl = searchSummonerServiceImpl;
	}

	@GetMapping("/{summonerName}")
	public ResponseEntity<SearchSummonerDTO> getSummonerInfo(@PathVariable("summonerName") String summonerName){
	    log.info(">>>>> SearchSummonerRestController.getSummonerInfo.executed()");

		SearchSummonerDTO summonerInfo = searchSummonerServiceImpl.searchSummoner(summonerName);
	    return ResponseEntity.ok(summonerInfo);
	}
}
