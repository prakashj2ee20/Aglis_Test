package com.test.product.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.product.entity.ProductEntity;
import com.test.product.repo.ProductRepository;
import com.test.product.response.ProductResponse;

@Service
public class ProductService {

	@Autowired
	ProductRepository prdRepos;

	public ProductEntity getconfigdetails(String domain) {

		ProductEntity res = (ProductEntity) prdRepos.findAll();

		return res;

	}

}
