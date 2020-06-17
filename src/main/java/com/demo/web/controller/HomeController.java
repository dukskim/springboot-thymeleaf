package com.demo.web.controller;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import ch.qos.logback.classic.Logger;

@Controller
@RequestMapping("/home")
public class HomeController {

	private final Logger logger = (Logger) LoggerFactory.getLogger(this.getClass());

	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public String hello(Model model) {
		logger.debug("hello page !!!");
		model.addAttribute("id", "myId");
		model.addAttribute("name", "myName");
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("id", "yourId");
		map.put("name", "yourName");
		model.addAttribute("mapData", map);
		return "hello";
	}

	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public String home(Model model) {
		logger.debug("home page !!!");
		return "/page/home";
	}
}
