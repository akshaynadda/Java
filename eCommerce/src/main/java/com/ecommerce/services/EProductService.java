package com.ecommerce.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ecommerce.entity.EProduct;
import com.ecommerce.repositaries.EProductRepository;

@Service
public class EProductService {

	@Autowired
	private EProductRepository eProdRepo;

	public List<EProduct> findAllProducts(Integer catKey) {
		return eProdRepo.findByCategoryCatKey(catKey);
	}

	public String addProduct(EProduct prod) {
		eProdRepo.save(prod);
		return "Product added successfully";
	}

}
