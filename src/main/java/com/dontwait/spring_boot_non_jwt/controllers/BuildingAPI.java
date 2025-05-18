package com.dontwait.spring_boot_non_jwt.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.dontwait.spring_boot_non_jwt.exceptions.FieldRequiredExeption;
import com.dontwait.spring_boot_non_jwt.models.BuildingResponse;
import com.dontwait.spring_boot_non_jwt.models.BuildingSearchRequest;
import com.dontwait.spring_boot_non_jwt.services.BuildingService;


@RestController
public class BuildingAPI {
	
	@Autowired
	private BuildingService buildingService;
	
	
	@PostMapping(value="api/building")
	public List<BuildingResponse> getBuilding(@RequestBody BuildingSearchRequest request) {
		return buildingService.findAll(request);
	}
	
	private void validate(BuildingResponse request) {
		if(request.getName().isEmpty() || request.getName() == null || request.getNumberOfBasement() == null)
			throw new FieldRequiredExeption("name or number of base is null");
	}
	
	

	
	@DeleteMapping("api/building/{id}/{name}")
	public void deleteBuilding(@PathVariable Integer id,
							   @PathVariable(required = false) String name,
							   @RequestParam String ward) {
		System.out.println("Delete building has id: " + id + " " + name + " " + ward);
		
	}
	
}