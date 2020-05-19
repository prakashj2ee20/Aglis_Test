package com.test.product.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.test.product.entity.ProductEntity;

@Repository
public interface ProductRepository  extends CrudRepository<ProductEntity, Integer>{

}
