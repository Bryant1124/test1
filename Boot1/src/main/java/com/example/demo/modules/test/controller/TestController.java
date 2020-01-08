package com.example.demo.modules.test.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
   @RequestMapping(value="/test/info")
   public String Text(){
	   
	return "nihao";
	   
   }
}
