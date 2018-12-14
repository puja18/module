package com.cg.sortingproducts.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.cg.sortingproducts.bean.Product;
import com.cg.sortingproducts.service.IProductService;

@Controller
public class MyController {
	@Autowired
	IProductService service;

	public String sortingProducts() {
		return "productsorting";

	}

	@RequestMapping(value = "price", method = RequestMethod.GET)
	public String priceCart() {
		return "range";

	}
	
	@RequestMapping(value = "dosorting", method = RequestMethod.GET)
	public ModelAndView priceRange(@RequestParam("startRange")int maxRange,@RequestParam("endRange")int minRange) {
		List<Product> products = service.priceRange(maxRange,minRange);
		return new ModelAndView("ProductList", "temp", products);

	}
	@RequestMapping(value = "ascending", method = RequestMethod.GET)
	public ModelAndView sortByAscending() {
		List<Product> produc = service.sortByAscending();
		return new ModelAndView("ProductList", "temp", produc);

	}
	@RequestMapping(value = "descending", method = RequestMethod.GET)
	public ModelAndView sortByDecending() {
		List<Product> produ = service.sortByDecending();
		return new ModelAndView("ProductList", "temp", produ);

	}


	@RequestMapping(value = "rating", method = RequestMethod.GET)
	public ModelAndView bestSellers() {
		List<Product> products = service.bestSellers();
		return new ModelAndView("ProductList", "temp", products);

	}

	@RequestMapping(value = "views", method = RequestMethod.GET)
	public ModelAndView mostViewed() {
		List<Product> product = service.mostViewed();
		return new ModelAndView("ProductList", "temp", product);

	}

}
