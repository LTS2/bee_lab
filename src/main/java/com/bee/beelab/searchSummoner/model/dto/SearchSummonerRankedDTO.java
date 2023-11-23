package com.bee.beelab.searchSummoner.model.dto;

import lombok.*;
import org.springframework.stereotype.Component;

/**
 * @author : jiny
 * @fileName : SearchSummonerRankedDTO
 * @since : 11/22/23
 * @apiNote League-V4 API
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Component
public class SearchSummonerRankedDTO {

	private String leagueId;
	private String summonerId;      // 플레이어의 암호화된 소환사 ID입니다.
	private String summonerName;
	private String queueType;
	private String tier;
	private String rank;	        // 	티어 내 플레이어의 디비전입니다.
	private int leaguePoints;
	private int wins;               // 협곡 승리 횟수.
	private int losses;             // 협곡 패배 횟수.
	private boolean hotStreak;
	private boolean veteran;
	private boolean freshBlood;
	private boolean inactive;

}
