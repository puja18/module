package com.cg.sortingproducts.dao;

import java.util.List;
import java.util.Set;

import com.cg.sortingproducts.bean.Product;

public interface IProductDao {
	public List<Product> priceRange(int maxRange, int minRange);
	public List<Product> sortByAscending();
	public List<Product> sortByDecending();
	public List<Product> bestSellers();
	public List<Product> mostViewed();
	
}
