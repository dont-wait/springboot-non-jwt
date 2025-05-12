package com.dontwait.spring_boot_non_jwt.repositories;


import java.util.List;

import com.dontwait.spring_boot_non_jwt.entity.Building;

public interface BuildingRepository {
	List<Building> findAll(String name, Long districtId);
}
