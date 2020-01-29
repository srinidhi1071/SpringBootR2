package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.model.Alien;

@Controller
public class HomeController {
	@RequestMapping("/")
	public String Home()
	{
		return "index.jsp";
	}
	
	@RequestMapping("reg")
	public String RegPage()
	{
		return "reg.jsp";
	}
	
	
//	Using HttpServletReqest and HttpSession
//	@RequestMapping("add")
//	public String add(HttpServletRequest req)
//	{
//		int i =Integer.parseInt(req.getParameter("add1"));
//		int j =Integer.parseInt(req.getParameter("add2"));
//		int result = i+j;
//		HttpSession session =req.getSession();
//		session.setAttribute("result", result);
//		return "result.jsp";
//	}
	
	@RequestMapping("add")
	public String add(@RequestParam("add1")int i,@RequestParam("add2")int j,ModelMap m)
	{
		
		
		int result = i+j;
		
		m.addAttribute("result", result);
		return "result.jsp";
	}
	
	@RequestMapping("addAlien")
	public String addAlien(@ModelAttribute("alien") Alien alien )
	{
		
		return "result.jsp";
		
	}
	
}
