package com.ecommerce.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.entity.ECategory;
import com.ecommerce.repositaries.ECategoryRepository;

@Service
public class ECategoryService {

	@Autowired
	private ECategoryRepository eCatRepo;

	public List<ECategory> findAllCategories() {
		return eCatRepo.findAll();
	}

	public String addCategory(ECategory cat) {
		eCatRepo.save(cat);
		return "Category added successfully";
	}

}
