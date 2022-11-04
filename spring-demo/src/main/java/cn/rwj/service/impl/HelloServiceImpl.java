package cn.rwj.service.impl;

import cn.rwj.service.HelloService;
import org.springframework.stereotype.Service;

/**
 * @Author rwj
 * @Date 2022/11/4
 * @Description
 */
@Service
public class HelloServiceImpl implements HelloService {
	@Override
	public void sayHello() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Hello everybody");
	}

	@Override
	public void JustWantToThrowException() {
		throw  new RuntimeException("hello exception");
	}
}
