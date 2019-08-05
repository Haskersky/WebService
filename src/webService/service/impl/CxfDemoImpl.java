package webService.service.impl;

import web.webService.service.CxfDemo;

/**
 * @author shikai
 * @version 创建时间：2019年5月15日 上午8:09:05
 * 
 */

public class CxfDemoImpl implements CxfDemo {

	@Override
	public String helloWord(String name) {
		// TODO Auto-generated method stub
		return "hello "+name+"!!!";
	}
	
}
