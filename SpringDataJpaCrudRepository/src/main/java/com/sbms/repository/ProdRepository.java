package com.sbms.repository;

import org.springframework.data.repository.CrudRepository;

import com.sbms.entity.Product;

public interface ProdRepository extends CrudRepository<Product, Integer> {

}
