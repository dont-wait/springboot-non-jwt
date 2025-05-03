package com.dontwait.spring_boot_non_jwt.api;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.dontwait.spring_boot_non_jwt.dto.Buildingdto;
import com.dontwait.spring_boot_non_jwt.dto.ErrorResponseDto;
import com.dontwait.spring_boot_non_jwt.exceptions.FieldRequiredExeption;


@RestController
public class BuildingAPI {
//	@GetMapping("/test")
//	public String testAPI() {
//		return "Hello world";
//	}
	
	
	//Neu tren client gui ve CO' KEY vidu "name=" nhung KO CO VALUE :)) 
	//Nhan vao empty
	
	//vay neu khong co key lan value thi... NULL
	
	//TRONG JAVA CO 2 TH KHI NHAN DU LIEU TU PARAM GUI VE
	//MA KIEU DU LIEU CUA BIEN NHAN LA STRING:
		//NULL: KO KEY-KO VALUE
		//EMPTY: CO KEY-KO VALUE
	//... CAC KIEU DU LIEU CON LAI THI AUTO NULL NEU KO BAT KI FIELD HOAC VALUE = EMPTY 
	// AUTO-NULL
	@PostMapping(value="api/building")
	public Object getBuilding(@RequestBody Buildingdto request) {
		//Xu li duoi db rui`
		//h tra ve cho client
		try {
			validate(request);
		} catch (FieldRequiredExeption e) {
			ErrorResponseDto err = new ErrorResponseDto();
			err.setError(e.getMessage());
			List<String> details = new ArrayList<String>();
			details.add("Check again name or numberOfBasement because u have null field");
			
			err.setDetails(details);
			return err;
		}
		return null;
	}
	
	private void validate(Buildingdto request) throws FieldRequiredExeption {
		if(request.getName().isEmpty() || request.getName() == null || request.getNumberOfBasement() == null)
			throw new FieldRequiredExeption("name or number of base is null");
	}
	
	
	//khong can ghi tung param de filter
//	@PostMapping(value="api/building")
//	public Buildingdto getBuildingV2(@RequestBody Buildingdto request) {
//		return request;
//	}
	
	@DeleteMapping("api/building/{id}/{name}")
	public void deleteBuilding(@PathVariable Integer id,
							   @PathVariable(required = false) String name,
							   @RequestParam String ward) {
		System.out.println("Delete building has id: " + id + " " + name + " " + ward);
		
	}
	
}