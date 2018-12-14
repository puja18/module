package com.cg.sortingproducts.service;

import java.util.List;
import java.util.Set;

import javax.transaction.Transactional;
import javax.xml.ws.ServiceMode;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.sortingproducts.bean.Product;
import com.cg.sortingproducts.dao.IProductDao;


@Service("customerservice")
@Transactional
public class ProductServiceImpl implements IProductService {

	@Autowired
    IProductDao dao;
    
	@Override
	public List<Product> priceRange(int maxRange, int minRange) {
		// TODO Auto-generated method stub
		return dao.priceRange(maxRange, minRange);
	}

	@Override
	public List<Product> sortByAscending() {
		// TODO Auto-generated method stub
		return dao.sortByAscending();
	}

	@Override
	public List<Product> sortByDecending() {
		// TODO Auto-generated method stub
		return  dao.sortByDecending();
	}

	@Override
	public List<Product> mostViewed() {
		// TODO Auto-generated method stub
		return dao.mostViewed();
	}

	@Override
	public List<Product> bestSellers() {
		// TODO Auto-generated method stub
		return dao.bestSellers();
	}

	
}
