package springmvcProject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController 
{
	@RequestMapping("/home")
	public String home()
	{
		System.out.println("this is url page");
		return "index";
	}
	@RequestMapping("/about")
	public String about()
	{
		System.out.println("this is about url page");
		return "about";
	}

}
