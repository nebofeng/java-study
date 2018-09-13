package pers.nebo.web.webserver;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pers.nebo.web.webhandler.AliYunHttp;

/**
 * @auther nebofeng@gmail.com
 * @date 2018/9/13 14:28
 */
@RestController
@EnableAutoConfiguration
public class HttpController {


	@RequestMapping("/")
	String home() {


		return "(1)/getpubicip?privateip=XX.XXX.XXX.XX | XXX-XXX-XXX-XX \n " +"======="+
		       "(2)/getallip";
	}

	@RequestMapping(value = "/getpubicip",method = RequestMethod.GET)
	String getPublicIp(@RequestParam("privateip") String privateip) {
		return AliYunHttp.getPublicIp(privateip.replace("-","."));
	}
	@RequestMapping(value = "/getallip",method = RequestMethod.GET)
	String getAllIp() {
		return AliYunHttp.getAllIp();
	}

	public static void main(String[] args) {
		//传入参数：  请求 时间，
		AliYunHttp.start(10*60);
		SpringApplication.run(HttpController.class, args);
	}


}
