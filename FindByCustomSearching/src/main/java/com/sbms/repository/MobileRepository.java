package com.sbms.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sbms.entity.Mobile;

public interface MobileRepository extends JpaRepository<Mobile, Long> {
	
	List<Mobile> findByBrand(String brand);
	List<Mobile> findByRamGreaterThan(int ram);
	List<Mobile> findByBrandLikeOrderByPriceAsc(String brand);
}
