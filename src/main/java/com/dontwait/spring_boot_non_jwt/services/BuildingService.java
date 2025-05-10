package com.dontwait.spring_boot_non_jwt.services;

import java.util.List;

import com.dontwait.spring_boot_non_jwt.models.BuildingResponse;

public interface BuildingService {
	List<BuildingResponse> findAll(String name);

}
