package com.bee.beelab.API.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Component
public class SummonerSearchDTO {

	private String accountId; // 암호화된 계정 ID입니다. 최대 길이는 56자입니다.
	private int profileIconId; // 소환사와 연결된 소환사 아이콘의 ID입니다.
	private long revisionDate; // 소환사가 마지막으로 수정된 날짜는 에포크 밀리초로 지정됩니다. 다음 이벤트는 이 타임스탬프를 업데이트합니다: 소환사 이름 변경, 소환사 레벨 변경, 프로필 아이콘 변경.
	private String name; // 소환사 이름.
	private String id; // 암호화된 소환사 ID. 최대 길이는 63자입니다.
	private String puuid; // 암호화된 PUUID. 정확한 길이는 78자입니다.
	private long summonerLevel; // 	소환사와 관련된 소환사 레벨입니다.

}
