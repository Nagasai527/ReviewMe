/**
 * 
 */
package com.reviewMe.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.reviewMe.model.Product;

/**
 * @author nnaruman
 *
 */
@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
	
	public List<Product> findByParentProductIsNull();
	
	public List<Product> findByParentProduct(long parentProdId);
	
	public List<Product> findById(long productId);
}
