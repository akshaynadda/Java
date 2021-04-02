package com.ecommerce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.entity.ECategory;
import com.ecommerce.services.ECategoryService;

@RestController
public class ECategoryController {

	@Autowired
	private ECategoryService eCatService;
	
	@RequestMapping("/Category")
	public List<ECategory> getAllCategories(){
		return eCatService.findAllCategories();
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/Category/add")
	public String addCategory( @RequestBody ECategory cat) {
		return eCatService.addCategory(cat);
	}
}
