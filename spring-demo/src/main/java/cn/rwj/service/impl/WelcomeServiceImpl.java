package cn.rwj.service.impl;

import cn.rwj.service.WelcomeService;

/**
 * @Author rwj
 * @Date 2022/10/24
 * @Description
 */
public class WelcomeServiceImpl implements WelcomeService {
	@Override
	public void sayHello(String name) {
		System.out.println("欢迎您：" + name);
	}
}
