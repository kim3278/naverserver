package com.test.naverserverproject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JenkinsController {
	@RequestMapping("/jenkins")
	public String jenkins() {
		return "jenkins";
	}
}
