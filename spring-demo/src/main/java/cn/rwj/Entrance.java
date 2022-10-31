package cn.rwj;

import cn.rwj.service.WelcomeService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * @Author rwj
 * @Date 2022/10/24
 * @Description
 */
public class Entrance {
	public static void main(String[] args) {
		System.out.println("Hello");
		String xmlPath = "E:\\study\\spring\\read-src\\spring-framework\\spring-demo\\src\\main\\resources\\spring-config.xml";
		ApplicationContext applicationContext = new FileSystemXmlApplicationContext(xmlPath);
		WelcomeService welcomeService = (WelcomeService) applicationContext.getBean("welcomeService");
		welcomeService.sayHello("任武杰");
	}
}

