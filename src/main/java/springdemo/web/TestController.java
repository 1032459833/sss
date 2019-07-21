package springdemo.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/test")
public class TestController {

	@RequestMapping(value="/aa",method=RequestMethod.GET)
//	@ResponseBody
	public String getStr() {
		System.out.println("2222222");
		return "aa/aa";
	}
	
	@RequestMapping(value="/commitStr")
	@ResponseBody
	public String getStr22(String name,String pwd) {
		System.out.println("2222222");
		System.out.println(name);
		System.out.println(pwd);
		return "111111";
	}
	
	
	
}
