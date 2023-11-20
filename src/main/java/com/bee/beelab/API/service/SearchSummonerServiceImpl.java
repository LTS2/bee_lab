package com.bee.beelab.API.service;

import com.bee.beelab.API.model.SummonerSearchDTO;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;

@Service
public class SearchSummonerServiceImpl implements SearchSummonerService {

	@Value("${riot.api_key}")
	private String RIOT_API_KEY;

	/**
	 * 소환사 검색 기능 */
	@Override
	public HashMap<String, String> searchSummoner(String summonerName) {
		String url = "https://kr.api.riotgames.com/lol/summoner/v4/summoners/by-name/" + summonerName + "?api_key=" + RIOT_API_KEY;

		RestTemplate restTemplate = new RestTemplate();

		// Riot API에 GET 요청 보내기
		SummonerSearchDTO summonerSearchDTO = restTemplate.getForObject(url, SummonerSearchDTO.class);

		// 가져온 데이터 처리
		HashMap<String, String> summoner = new HashMap<>();
		summoner.put("accountId", summonerSearchDTO.getAccountId()); // 암호화된 계정 ID입니다. 최대 길이는 56자입니다.
		summoner.put("profileIconId", String.valueOf(summonerSearchDTO.getProfileIconId())); // int 타입 소환사와 연결된 소환사 아이콘의 ID입니다.
		summoner.put("revisionDate", String.valueOf(summonerSearchDTO.getRevisionDate()));  // long 타입 소환사가 마지막으로 수정된 날짜는 에포크 밀리초로 지정됩니다. 다음 이벤트는 이 타임스탬프를 업데이트합니다: 소환사 이름 변경, 소환사 레벨 변경, 프로필 아이콘 변경.
		summoner.put("name", summonerSearchDTO.getName()); // 소환사 이름.
		summoner.put("id", summonerSearchDTO.getId()); // 암호화된 소환사 ID. 최대 길이는 63자입니다.
		summoner.put("puuid", summonerSearchDTO.getPuuid()); // 암호화된 PUUID. 정확한 길이는 78자입니다.
		summoner.put("summonerLevel", String.valueOf(summonerSearchDTO.getSummonerLevel())); // long 타입 소환사와 관련된 소환사 레벨입니다.


		return summoner;
	}


}
