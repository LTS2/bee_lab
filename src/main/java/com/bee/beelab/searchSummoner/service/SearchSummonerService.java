package com.bee.beelab.searchSummoner.service;

import com.bee.beelab.searchSummoner.model.entity.SearchSummonerDTO;
import com.bee.beelab.searchSummoner.model.entity.SearchSummonerRankedDTO;

import java.util.HashMap;
import java.util.List;
import java.util.Set;

public interface SearchSummonerService {

	/**
	 * @fileName    : SearchSummonerService.java
	 * @author      : jiny
	 * @since       : 11/19/23
	 * @apiNote     : 유저 이름으로 검색하는 1차 API
	 */
	SearchSummonerDTO searchSummoner(String summonerName);

	/**
	 * @fileName    : SearchSummonerService.java
	 * @author      : jiny
	 * @since       : 11/22/23
	 * @apiNote     : searchSummoner를 이용해서 가져온 id 값으로 유저의 티어와 승수 등을 가져오는 2차 API
	 */
	SearchSummonerRankedDTO searchSummonerRanked(String summonerId);

}
