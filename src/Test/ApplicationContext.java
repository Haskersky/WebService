package Test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import web.webService.service.CxfDemo;
import webService.service.impl.CxfDemoImpl;

/**
 * @author shikai
 * @version 创建时间：2019年8月5日 上午10:35:31
 * 
 */

public class ApplicationContext {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext ctx =
			    new ClassPathXmlApplicationContext("classpath*:applicationContext.xml");
		
		CxfDemo  Cxf = (CxfDemo) ctx.getBean("cxfDemoImpl");
		
		
		System.out.println(Cxf.helloWord("你好"));
		System.out.println(((CxfDemo)ctx.getBean("cxfDemoImpl")).helloWord("大侠"));
	}

}
