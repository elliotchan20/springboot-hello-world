package lu.lllc.boottest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
	
	@RequestMapping("/route-1")
	public String hello(){
		return "hello";
	}
}
