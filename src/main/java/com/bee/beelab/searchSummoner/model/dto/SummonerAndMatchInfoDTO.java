package com.bee.beelab.searchSummoner.model.dto;

import com.bee.beelab.matchv5.model.dto.MatchDto;
import com.bee.beelab.searchSummoner.model.entity.SearchSummonerDTO;
import lombok.*;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author : ejum
 * @fileName : SummonerAndMatchInfoDTO
 * @since : 2023/11/24
 * @apiNote : 소환사 전적 정보를 가지고 있는 Match-V5, 소환사 정보를 가지고 있는 Summoner-V4
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Component
@Builder
public class SummonerAndMatchInfoDTO {

    private SearchSummonerDTO summonerDTO;
    private List<MatchDto> matchDtoList;

}
