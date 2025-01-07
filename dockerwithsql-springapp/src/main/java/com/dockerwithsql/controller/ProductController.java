package com.dockerwithsql.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dockerwithsql.entity.Product;
import com.dockerwithsql.repository.ProductRepository;

@RestController
@RequestMapping("products")
public class ProductController {

	@Autowired
	private ProductRepository productrepo;
	
	@PostMapping("/save")
	public Product addProduct(@RequestBody Product pro) {
		return productrepo.save(pro);
	}
	
	@GetMapping("/find")
	public List<Product> findProduct(){
		return productrepo.findAll();
	}
}
