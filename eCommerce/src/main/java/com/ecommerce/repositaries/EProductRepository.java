package com.ecommerce.repositaries;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.ecommerce.entity.EProduct;

@Repository
public interface EProductRepository extends JpaRepository<EProduct, Integer>{

	public List<EProduct> findByCategoryCatKey(Integer catKey);
}
