package com.bee.beelab.build.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

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
