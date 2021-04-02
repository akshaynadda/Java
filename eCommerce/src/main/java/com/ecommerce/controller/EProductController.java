package com.ecommerce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.entity.ECategory;
import com.ecommerce.entity.EProduct;
import com.ecommerce.services.EProductService;

@RestController
public class EProductController {

	@Autowired
	private EProductService eProdService;
	
	@RequestMapping("/Category/{catKey}/Products")
	public List<EProduct> getAllProducts(@PathVariable Integer catKey){
		return eProdService.findAllProducts(catKey);
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/Category/{catId}/Products")
	public String addProduct( @RequestBody EProduct prod,@PathVariable Integer catId) {
		prod.setCategory(new ECategory(catId,"","",""));
		return eProdService.addProduct(prod);
	}
}
