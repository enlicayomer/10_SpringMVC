package com.omerenlicay.controller;



import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

@Controller
public class AnasayfaController extends AbstractController {
	
	private static final Logger logger = LoggerFactory.getLogger(AnasayfaController.class);
	
	@RequestMapping(value = "/anasayfa", method = RequestMethod.GET)
	public String home( Model model) {
	
		
		model.addAttribute("anahtarKelime", "selam spring MVC Kardeþ" );
		
		return "AnasayfaViews";
	}

	@RequestMapping(value = "/karsilama.aspx", method = RequestMethod.GET)
	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest arg0, HttpServletResponse arg1)
			throws Exception {
		
		String adi="ömer";
		String soyadi="enliçay";
		ModelAndView modelAndView=new ModelAndView("AnasayfaViews");
		modelAndView.addObject("p_adi",adi);
		modelAndView.addObject("p_soyadi",soyadi);
		return modelAndView;
	}
	
}
