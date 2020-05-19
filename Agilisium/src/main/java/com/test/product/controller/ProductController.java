package com.test.product.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.test.product.entity.ProductEntity;
import com.test.product.response.ProductResponse;
import com.test.product.service.ProductService;

@RestController
public class ProductController {

	@Autowired
	public ProductService prdService;

	@GetMapping(value = "{domain}/api/getproductdetails", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<ProductResponse> getproductdetails(@PathVariable String domain) {

		ProductEntity prdEntity = prdService.getconfigdetails(domain);

		ProductResponse resp = new ProductResponse();
		resp.setId(prdEntity.getId());
		resp.setName(prdEntity.getName());
		resp.setDescription(prdEntity.getDescription());
		resp.setPrice(prdEntity.getPrice());

		return new ResponseEntity<>(resp, HttpStatus.OK);

	}

}
