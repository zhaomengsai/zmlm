package com.aaa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("test")
public class test {
	
	@RequestMapping("t1")
	public String t1(){
		System.out.println("sss");
		return "/forground/test01";
	}
	
	@RequestMapping("t2")
	@ResponseBody
	public Integer t2(String s1){
		System.out.println("sss");
		if(s1=="111"){
			return 1;
		}else{
			return 2;
		}
		
	}

}
