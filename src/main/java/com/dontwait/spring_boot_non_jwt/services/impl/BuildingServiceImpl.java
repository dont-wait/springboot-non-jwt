package com.dontwait.spring_boot_non_jwt.services.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dontwait.spring_boot_non_jwt.entity.Building;
import com.dontwait.spring_boot_non_jwt.models.BuildingResponse;
import com.dontwait.spring_boot_non_jwt.repositories.BuildingRepository;
import com.dontwait.spring_boot_non_jwt.services.BuildingService;


@Service
public class BuildingServiceImpl implements BuildingService{

	@Autowired
	private BuildingRepository buildingRepository;
	
	@Override
	public List<BuildingResponse> findAll(String name, Long districtId) {
		List<Building> buildingEntities = buildingRepository.findAll(name, districtId);
		List<BuildingResponse> result = new ArrayList<BuildingResponse>();
		
		for(Building buildingEntity : buildingEntities) {
			
			BuildingResponse buildingResponse = new BuildingResponse();
			buildingResponse.setName(buildingEntity.getName());
			buildingResponse.setNumberOfBasement(buildingEntity.getNumberOfBasement());
			buildingResponse.setAddress(buildingEntity.getStreet() + ", " + buildingEntity.getWard());
			result.add(buildingResponse);
		}
			
		
		return result;
	}

}
