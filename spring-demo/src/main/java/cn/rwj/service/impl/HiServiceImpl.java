package cn.rwj.service.impl;

import cn.rwj.service.HiService;
import org.springframework.stereotype.Service;

/**
 * @Author rwj
 * @Date 2022/11/4
 * @Description
 */
@Service
public class HiServiceImpl implements HiService {
	@Override
	public void sayHi() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Hi everyone");
	}

	@Override
	public String justWantToSayHi() {
		return "Just want to say hi";
	}
}
