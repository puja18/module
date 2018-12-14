package com.cg.sortingproducts.dao;

import java.util.List;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import oracle.net.aso.q;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cg.sortingproducts.bean.Product;

@Repository("productservice")
public class ProductDaoImpl implements IProductDao{
	@PersistenceContext
	EntityManager em;
	
	
	@Override
	public List<Product> priceRange(int maxRange, int minRange) {
		// TODO Auto-generated method stub
		Query query = em.createQuery("SELECT p FROM Product p WHERE p.productCost between startRange:maxRange and endRange:minRange");
		query.setParameter("startRange", maxRange);
		query.setParameter("endRange", minRange);
		List<Product> prod = query.getResultList();
		return prod;
	}
	
	@Override
	public List<Product> sortByAscending() {
		// TODO Auto-generated method stub
		Query query1 = em.createQuery("SELECT p FROM Product p  ORDER BY productCost ASC");
		List<Product> products = query1.getResultList();
		for (Product pro : products) {
			System.out.println(pro);
		}
		return products;
	}

	@Override
	public List<Product> sortByDecending() {
		// TODO Auto-generated method stub
		Query query2 = em.createQuery("SELECT p FROM Product p ORDER BY productCost DESC");
			List<Product> prod= query2.getResultList();
		/*	products.sort(product.getProductCost());*/
			for (Product product2 : prod) {
				System.out.println(product2);
			}		
		return prod;
	}

	@Override
	public List<Product> mostViewed() {
		// TODO Auto-generated method stub
		Query query3 = em.createQuery("SELECT p FROM Product p WHERE p.views>=50");
		List<Product> product = (List<Product>) query3.getResultList();
		for (Product product2 : product) {
			System.out.println(product2);
		}
		return product;
	}

	@Override
	public List<Product> bestSellers() {
		// TODO Auto-generated method stub
		Query query4 = em.createQuery("SELECT p FROM Product p WHERE p.rating >= 3");
		 List<Product> produc = (List<Product>) query4.getResultList();
		 for (Product product : produc) {
		  System.out.println(produc);
		}
		return produc;
	}

	
	

}
