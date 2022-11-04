package cn.rwj.controller;

import cn.rwj.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * @Author rwj
 * @Date 2022/11/4
 * @Description
 */
@Controller
public class HelloController {
	@Autowired
	private HelloService helloService;
	public void handleRequest(){
		helloService.sayHello();
		helloService.JustWantToThrowException();
	}
}
