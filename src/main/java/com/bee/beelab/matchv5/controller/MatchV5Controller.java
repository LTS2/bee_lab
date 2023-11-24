package com.bee.beelab.matchv5.controller;

import com.bee.beelab.matchv5.model.dto.MatchDto;
import com.bee.beelab.matchv5.service.MatchV5Service;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * @author : ejum
 * @fileName : MatchV5
 * @since : 2023/11/23
 */
@Controller
@Slf4j
public class MatchV5Controller {

    @Autowired
    private MatchV5Service matchV5Service;



}
