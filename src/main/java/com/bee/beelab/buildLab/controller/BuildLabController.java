package com.bee.beelab.buildLab.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * 빌드연구소 컨트롤러
 *
 * @author : minjooo
 * @fileName : BuildLabController
 * @since : 2023/11/21
 */

@Controller
public class BuildLabController {

    @GetMapping("/buildLab")
    public String build(){

        return "build-lab/build-main";
    }

    @GetMapping("/writeBuild")
    public String writeBuild(){
        return "build-lab/build-write";
    }
}
