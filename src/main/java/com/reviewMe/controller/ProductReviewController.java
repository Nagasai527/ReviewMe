package com.reviewMe.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.reviewMe.model.Product;
import com.reviewMe.service.ProductService;

/**
 * @author nnaruman
 *
 */
@RestController
public class ProductReviewController {
	
	@Autowired
	private ProductService productService;
	
	@RequestMapping(value = "reviewMe/products", method = RequestMethod.GET, produces = "application/json")
	public List<Product> getAllProducts() throws Exception {
		return productService.getAllProducts();
	}
	
	@RequestMapping(value = "reviewMe/products/{parentProdId}", method = RequestMethod.GET, produces = "application/json")
	public List<Product> getChildProducts(@Valid @PathVariable(required=true) String parentProdId) throws Exception {
		return productService.getChildProducts(Long.valueOf(parentProdId));
	}
	
	@RequestMapping(value = "reviewMe/product/{id}", method = RequestMethod.GET, produces = "application/json")
	public List<Product> getProductReviews(@Valid @PathVariable(required=true) String id) throws Exception {
		return productService.getProductReviews(Long.valueOf(id));
	}

}
