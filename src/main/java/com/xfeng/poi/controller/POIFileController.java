package com.xfeng.poi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller  
public class POIFileController{
	@RequestMapping("/")
	@ResponseBody
	String home(){
		System.out.println("springboot launched successfully");
		return "springboot start";
	}
}