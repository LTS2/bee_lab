package com.bee.beelab.home.controller;

import com.bee.beelab.test.controller.TestController;
import com.bee.beelab.test.entity.Post;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Slf4j
@Controller
public class HomeController {

	@RequestMapping("/test")
	public String test(Model model){
		List<Post> testData = TestController.generateTestData();
		model.addAttribute("posts", testData);
		return "test";
	}


}
