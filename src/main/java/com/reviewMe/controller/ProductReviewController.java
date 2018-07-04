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

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 * @author nnaruman
 *
 */
@RestController
@Api(value="reviewMe app", description="Operations of Product Review Controller")
public class ProductReviewController {
	
	@Autowired
	private ProductService productService;
	
	@RequestMapping(value = "reviewMe/products", method = RequestMethod.GET, produces = "application/json")
	@ApiOperation(value="View list of all products")
	public List<Product> getAllProducts() throws Exception {
		return productService.getAllProducts();
	}
	
	@RequestMapping(value = "reviewMe/products/{parentProdId}", method = RequestMethod.GET, produces = "application/json")
	@ApiOperation(value="View list of all sub-products for a selected product")
	public List<Product> getChildProducts(@Valid @PathVariable(required=true) String parentProdId) throws Exception {
		return productService.getChildProducts(Long.valueOf(parentProdId));
	}
	
	@RequestMapping(value = "reviewMe/product/{id}", method = RequestMethod.GET, produces = "application/json")
	@ApiOperation(value="View reviews of a selected product")
	public List<Product> getProductReviews(@Valid @PathVariable(required=true) String id) throws Exception {
		return productService.getProductReviews(Long.valueOf(id));
	}

}
