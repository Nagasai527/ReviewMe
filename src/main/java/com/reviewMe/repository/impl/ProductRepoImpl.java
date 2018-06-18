/**
 * 
 */
package com.reviewMe.repository.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.reviewMe.model.Product;
import com.reviewMe.repository.ProductRepo;
import com.reviewMe.repository.ProductRepository;

/**
 * @author nnaruman
 *
 */
@Repository
public class ProductRepoImpl implements ProductRepo {
	
	@Autowired
	private ProductRepository productRepository;

	public List<Product> getAllProducts() throws Exception {
		return productRepository.findByParentProductIsNull();
	}

	public List<Product> getChildProducts(long parentProdId) throws Exception {
		return productRepository.findByParentProduct(parentProdId);
	}
	
	public List<Product> getProductReviews(long productId) throws Exception {
		return productRepository.findById(productId);
	}

}
