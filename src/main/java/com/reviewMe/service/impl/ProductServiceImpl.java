/**
 * 
 */
package com.reviewMe.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.reviewMe.model.Product;
import com.reviewMe.repository.ProductRepo;
import com.reviewMe.service.ProductService;

/**
 * @author nnaruman
 *
 */
@Service
public class ProductServiceImpl implements ProductService {
	
	@Autowired
	private ProductRepo productRepo;

	@Override
	public List<Product> getAllProducts() throws Exception {
		return productRepo.getAllProducts();
	}

	@Override
	public List<Product> getChildProducts(long parentProdId) throws Exception {
		return productRepo.getChildProducts(parentProdId);
	}
	
	@Override
	public List<Product> getProductReviews(long productId) throws Exception {
		return productRepo.getProductReviews(productId);
	}


}
