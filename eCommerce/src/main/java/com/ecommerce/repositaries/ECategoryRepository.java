package com.ecommerce.repositaries;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecommerce.entity.ECategory;

@Repository
public interface ECategoryRepository extends JpaRepository<ECategory, Integer>{

}
