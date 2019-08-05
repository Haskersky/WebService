package web.webService.service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

/**
 * @author shikai
 * @version 创建时间：2019年5月15日 上午8:06:16
 * 
 */
@WebService
public interface CxfDemo {
	
	@WebMethod
	String   helloWord(@WebParam(name = "userName") String arg);

}
