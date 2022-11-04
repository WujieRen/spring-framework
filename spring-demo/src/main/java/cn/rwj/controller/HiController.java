package cn.rwj.controller;

import cn.rwj.service.HiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * @Author rwj
 * @Date 2022/11/4
 * @Description
 */
@Controller
public class HiController {
	@Autowired
	HiService hiService;
	public void handleRequest(){
		hiService.sayHi();
		hiService.justWantToSayHi();
	}

}
