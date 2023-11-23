package com.bee.beelab.matchv5.service;

import com.bee.beelab.matchv5.model.dto.MatchDto;

import java.util.HashMap;
import java.util.List;

/**
 * @author : ejum
 * @fileName : MatchV5Service
 * @since : 2023/11/23
 */
public interface MatchV5Service {


    List<String> getMatchId(String puuid);

    HashMap<String, MatchDto> getMatchInfo(List<String> matchId);
}
