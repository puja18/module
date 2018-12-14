package com.cg.sortingproducts.service;

import java.util.List;
import java.util.Set;

import com.cg.sortingproducts.bean.Product;

public interface IProductService {
	public List<Product> priceRange(int maxRange,int minRange);
	public List<Product> sortByAscending();
	public List<Product> sortByDecending();
	public List<Product> mostViewed();
	public List<Product> bestSellers();
	

}
