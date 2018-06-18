/**
 * 
 */
package com.reviewMe.repository;

import java.util.List;

import com.reviewMe.model.Product;

/**
 * @author nnaruman
 *
 */
public interface ProductRepo {

	public List<Product> getAllProducts() throws Exception;
	
	public List<Product> getChildProducts(long parentProdId) throws Exception;
	
	public List<Product> getProductReviews(long productId) throws Exception;
}
