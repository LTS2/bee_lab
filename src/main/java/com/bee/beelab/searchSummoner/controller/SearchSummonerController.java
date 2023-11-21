package com.bee.beelab.searchSummoner.controller;

import com.bee.beelab.searchSummoner.model.entity.SearchSummonerDTO;
import com.bee.beelab.searchSummoner.model.entity.SearchSummonerRankedDTO;
import com.bee.beelab.searchSummoner.service.SearchSummonerServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

/**
 * The type Search summoner controller.
 */
@Slf4j
@Controller
public class SearchSummonerController {

	private final SearchSummonerServiceImpl searchSummonerServiceimpl;

	/**
	 * Instantiates a new Search summoner controller.
	 *
	 * @param searchSummonerServiceimpl the api serviceimpl
	 */
	@Autowired
	public SearchSummonerController(SearchSummonerServiceImpl searchSummonerServiceimpl) {
		this.searchSummonerServiceimpl = searchSummonerServiceimpl;
	}


	/**
	 * Main string.
	 *
	 * @return the string
	 */
	@GetMapping("/")
	public String main(){
	    log.info(">>>>> SearchSummonerController.main.executed()");
	    return "search-summoner/main";
	}

	/**
	 * Search summoner string.
	 *
	 * @param model        the model
	 * @param summonerName the summoner name
	 * @return the string
	 * @Since 2023.11.15 작성
	 * @author 이우진
	 * @Link https ://developer.riotgames.com/apis#summoner-v4
	 * @apiNote 소환사 검색 기능 SUMMONER-V4 API 사용 [GET] /lol/summoner/v4/summoners/by-name/{summonerName} 가져오는 데이터 갯수 = 7 가져오는 데이터 항목 = accountId(계정 아이디), profileIconId(아이콘 아이디), revisionDate(갱신 날짜), name(소환사 이름), id(아이디), puuid(고유 식별자), summonerLevel(소환사 레벨)
	 */
	@GetMapping("summoners/kr/{summonerName}")
	public String searchSummoner(Model model, @PathVariable String summonerName){
		log.info(">>>>> SearchSummonerController.searchSummoner.executed()");

		SearchSummonerDTO summonerV4 = searchSummonerServiceimpl.searchSummoner(summonerName);
		SearchSummonerRankedDTO leagueV4 = searchSummonerServiceimpl.searchSummonerRanked(summonerV4.getId());


		model.addAttribute("summonerV4",  summonerV4);
		model.addAttribute("leagueV4",  leagueV4);

		return "search-summoner/search-summoner";
	}




}
