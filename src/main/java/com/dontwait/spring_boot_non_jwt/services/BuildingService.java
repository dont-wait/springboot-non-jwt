package com.dontwait.spring_boot_non_jwt.services;

import java.util.List;

import com.dontwait.spring_boot_non_jwt.models.BuildingResponse;
import com.dontwait.spring_boot_non_jwt.models.BuildingSearchRequest;

public interface BuildingService {
	List<BuildingResponse> findAll(BuildingSearchRequest request);

}
