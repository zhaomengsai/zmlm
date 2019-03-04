package com.aaa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("test")
public class test {
	
	@RequestMapping("play")
	public String t1(){
		System.out.println("sss");
		return "forground/play";
	}
	
	@RequestMapping("seek")
	public String t3(){
		System.out.println("bbb");
		return "/forground/seek";
	}
	
	@RequestMapping("uploading")
	public String t4(){
		System.out.println("lll");
		return "/forground/uploading";
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
