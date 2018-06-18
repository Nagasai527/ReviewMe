/**
 * 
 */
package com.reviewMe.service;

import java.util.List;

import com.reviewMe.model.Product;

/**
 * @author nnaruman
 *
 */
public interface ProductService {
	
	public List<Product> getAllProducts() throws Exception;
	
	public List<Product> getChildProducts(long parentProdId) throws Exception;
	
	public List<Product> getProductReviews(long productId) throws Exception;
}
