package com.bee.beelab.matchv5.service;

import com.bee.beelab.matchv5.model.dto.MatchDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : ejum
 * @fileName : MatchV5ServiceImpl
 * @since : 2023/11/23
 */
@Service
@Slf4j
public class MatchV5ServiceImpl implements MatchV5Service {

    @Value("${riot.api_key}")
    private String RIOT_API_KEY;
    private final RestTemplate restTemplate = new RestTemplate();


    /**
     * @fileName : MatchV5ServiceImpl.java
     * @author   : ejum
     * @since    : 2023/11/24 10:10
     * puuId를 통해 matchId를 가져오는 메서드
     */
    @Override
    public List<String> getMatchId(String puuid) {
        String url = "https://asia.api.riotgames.com/lol/match/v5/matches/by-puuid/" + puuid +"/ids?type=ranked&start=0&count=20&api_key=" +
                RIOT_API_KEY;

        ResponseEntity<List<String>> responseEntity = restTemplate.exchange(
                url,
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<List<String>>() {}
        );

        System.out.println(responseEntity.getBody());
        return responseEntity.getBody();
    }
    /**
     * @fileName : MatchV5ServiceImpl.java
     * @author   : ejum
     * @since    : 2023/11/24 12:24 작업 끝
     */
    @Override
    public List<MatchDto> getMatchInfo(List<String> matchIds) {

        List<MatchDto> result = new ArrayList<>();

        log.info("matchId = {}", matchIds);

        try {
            Thread.sleep(1000); // 1초 딜레이

        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            log.error("Thread interrupted while sleeping: {}", e.getMessage());
        }

        for (String matchId : matchIds) {
            String url = "https://asia.api.riotgames.com/lol/match/v5/matches/" + matchId + "?api_key=" + RIOT_API_KEY;

            ResponseEntity<MatchDto> responseEntity = restTemplate.getForEntity(url, MatchDto.class);
            result.add(responseEntity.getBody());

        }

        //TODO 최적화 시키기 First

        //TODO 필요한 정보들 적어놓기
        //TODO 필요한 정보들 Dto만들어서 build
        //TODO build한 정보들 화면에 뿌려주기

        return  result;
    }
}

