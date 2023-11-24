package com.bee.beelab.searchSummoner.service;

import com.bee.beelab.matchv5.controller.MatchV5Controller;
import com.bee.beelab.matchv5.model.dto.MatchDto;
import com.bee.beelab.matchv5.service.MatchV5Service;
import com.bee.beelab.searchSummoner.model.entity.SearchSummonerDTO;
import com.bee.beelab.searchSummoner.model.entity.SearchSummonerRankedDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.*;

@Service
public class SearchSummonerServiceImpl implements SearchSummonerService {

	@Value("${riot.api_key}")
	private String RIOT_API_KEY;

	private final RestTemplate restTemplate;

	@Autowired
	private MatchV5Service matchV5Service;

	@Autowired
	public SearchSummonerServiceImpl(RestTemplate restTemplate) {
		this.restTemplate = restTemplate;
	}

	/**
	 * 소환사 검색 기능 */
	@Override
	public SearchSummonerDTO searchSummoner(String summonerName) {
		String url = "https://kr.api.riotgames.com/lol/summoner/v4/summoners/by-name/" + summonerName + "?api_key=" + RIOT_API_KEY;


		ResponseEntity<SearchSummonerDTO> responseEntity = restTemplate.getForEntity(url, SearchSummonerDTO.class);

		String puuid = responseEntity.getBody().getPuuid();

		List<String> matchId = matchV5Service.getMatchId(responseEntity.getBody().getPuuid());

		HashMap<String, MatchDto> matchDto = matchV5Service.getMatchInfo(matchId);

			return responseEntity.getBody();
	}

	/**
	 * @fileName    : SearchSummonerService.java
	 * @author      : jiny
	 * @since       : 11/22/23
	 * @apiNote     : searchSummoner를 이용해서 가져온 id 값으로 유저의 티어와 승수 등을 가져오는 2차 API
	 */
	@Override
	public SearchSummonerRankedDTO searchSummonerRanked(String summonerId) {
		String url = "https://kr.api.riotgames.com/lol/league/v4/entries/by-summoner/" + summonerId +"?api_key=" + RIOT_API_KEY;

		ResponseEntity<List<SearchSummonerRankedDTO>> responseEntity = restTemplate.exchange(
				url,
				HttpMethod.GET,
				null,
				new ParameterizedTypeReference<List<SearchSummonerRankedDTO>>() {}
		);

		List<SearchSummonerRankedDTO> resultList = responseEntity.getBody();
		return (resultList != null && !resultList.isEmpty()) ? resultList.get(0) : new SearchSummonerRankedDTO();
	}


}
