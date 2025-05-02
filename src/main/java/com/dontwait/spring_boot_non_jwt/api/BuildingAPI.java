package com.dontwait.spring_boot_non_jwt.api;

import java.lang.module.ModuleDescriptor.Requires;
import java.util.Map;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.dontwait.spring_boot_non_jwt.dto.Buildingdto;

@RestController
public class BuildingAPI {
//	@GetMapping("/test")
//	public String testAPI() {
//		return "Hello world";
//	}
	
	@GetMapping(value="api/building")
	public Buildingdto getBuilding(@RequestParam(value="name", required = false) String name,
							@RequestParam(value="numberOfBasement", required = false) Integer noB,
							@RequestParam(value="ward", required = false) String ward,
							@RequestParam(value="street", required = false) String street) {
		//Xu li duoi db rui`
		//h tra ve cho client
		Buildingdto response = new Buildingdto();
		response.setName(name);
		response.setNumberOfBasement(noB);
		response.setWard(ward);
		response.setStreet(street);
		return response;
	}
	
	//khong can ghi tung param de filter
	@PostMapping(value="api/building")
	public Buildingdto getBuildingV2(@RequestBody Buildingdto request) {
		return request;
	}
	
	@DeleteMapping("api/building/{id}/{name}")
	public void deleteBuilding(@PathVariable Integer id,
							   @PathVariable(required = false) String name,
							   @RequestParam String ward) {
		System.out.println("Delete building has id: " + id + " " + name + " " + ward);
		
	}
	
}