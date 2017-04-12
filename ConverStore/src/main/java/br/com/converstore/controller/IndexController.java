package br.com.converstore.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("index")
public class IndexController {
	
	@RequestMapping("/main")
	public ModelAndView index() {
		return new ModelAndView("index");
	}

	@RequestMapping("/cadprodutos")
	public ModelAndView cadprodutos() {
		
		return new ModelAndView("cadprodutos");
	}

}