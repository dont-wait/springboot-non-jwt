package com.dontwait.spring_boot_non_jwt.services.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dontwait.spring_boot_non_jwt.models.BuildingResponse;
import com.dontwait.spring_boot_non_jwt.models.BuildingSearchRequest;
import com.dontwait.spring_boot_non_jwt.repositories.BuildingRepository;
import com.dontwait.spring_boot_non_jwt.services.BuildingService;


@Service
public class BuildingServiceImpl implements BuildingService{

	@Autowired
	private BuildingRepository buildingRepository;

	@Override
	public List<BuildingResponse> findAll(BuildingSearchRequest request) {
		List<BuildingResponse> result = new ArrayList<BuildingResponse>();
		return result;
	}

}
