package com.example.springORM.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.springORM.Model.Product;
import com.example.springORM.Service.ProductService;

@Controller
public class HomeController {
	
	@Autowired
	private ProductService service;
	
	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public String home(Model m) {
		List<Product> products = service.getProduct();
		m.addAttribute("items", products);
		m.addAttribute("message", "hello world");
		return "hello";
	}
}
