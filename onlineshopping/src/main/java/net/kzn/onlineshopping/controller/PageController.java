package net.kzn.onlineshopping.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import net.kzn.shoppingbackend.dao.CategoryDAO;

@Controller
public class PageController {

	@Autowired
	private CategoryDAO categoryDAO; //passing the list of category dari shoppingbackend folder
	

	@RequestMapping(value = {"/", "/home", "index"})
	public ModelAndView index(){
		
		ModelAndView mv = new ModelAndView("page"); // -> larinya ke page.jsp
		mv.addObject("title","Home"); 
		
		//passing the list of category dari shoppingbackend folder
		mv.addObject("categories",categoryDAO.list()); // categories diambil dari CategoryDAOImpl
		
		mv.addObject("userClickHome",true); 
		return mv;
	
	}
	
	@RequestMapping(value = "/about")
	public ModelAndView about(){
		
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title","About Us");
		mv.addObject("userClickAbout",true);
		return mv;
	}
	
	@RequestMapping(value = "/contact")
	public ModelAndView contact(){
		
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title","Contact Us");
		mv.addObject("userClickContact",true);
		return mv;
	}
	
	
	
	
	
//	@RequestMapping(value = {"/", "/home", "index"})
//	public ModelAndView index(){
//		
//		ModelAndView mv = new ModelAndView("page"); // -> larinya ke page.jsp
//		mv.addObject("greeting","Welcome to Spring Web MVC"); // -> nama parameternya greeting
//		return mv;
//	
//	}
	
	
	//URL : http://localhost:8080/onlineshopping/test?greeting=Hi%20Indra
//	@RequestMapping(value = {"/test"})
//	public ModelAndView test(@RequestParam("greeting")String greeting){ // parameternya greeting
//		
//		ModelAndView mv = new ModelAndView("page"); // -> larinya ke page.jsp
//		mv.addObject("greeting",greeting); // -> nama parameternya greeting
//		return mv;
//	
//	}

	
	//URL : http://localhost:8080/onlineshopping/test
//	@RequestMapping(value = {"/test"})
//	public ModelAndView test(@RequestParam(value="greeting", required=false)
//	String greeting){ // kata2 greeting divalue parameternya greeting diURL (?greeting) 
//		if(greeting == null){
//			greeting = "Hello there"; // kalo cuma ini http://localhost:8080/onlineshopping/test
//		}
//		ModelAndView mv = new ModelAndView("page"); // -> larinya ke page.jsp
//		mv.addObject("greeting",greeting); // -> nama parameternya greeting
//		return mv;
//	
//	}
	
	
	// URL : http://localhost:8080/onlineshopping/aha/hell
//	@RequestMapping(value = {"/aha/{greeting}"})
//	public ModelAndView aha(@PathVariable("greeting") // lebih mudah nambahin kata-kata setelah link variabelnya 
//	String greeting){ // 
//		if(greeting == null){
//			greeting = "Hello there";
//		}
//		ModelAndView mv = new ModelAndView("page"); // -> larinya ke page.jsp
//		mv.addObject("greeting",greeting); // -> nama parameternya greeting
//		return mv;
//	
//	}
//	
	
}
