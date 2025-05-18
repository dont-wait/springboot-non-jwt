package com.dontwait.spring_boot_non_jwt.entity;

public class Building {
	private Integer id;
	private String name;
	private String street;
	private String ward;
	private Integer districtId;
	private String structe;
	private Integer numberOfBasement;
	private Double floorArea;
	private String direction;
	private String level;
	private Integer rentPrice;
	private Integer rentPriceDescripsion;

	private String managerName;
	private String managerPhoneNumber;
	
	public Building() {
	}

	public Building(String name, String street, String ward, Integer districtId, String structe,
			Integer numberOfBasement, Double floorArea, String direction, String level, Integer rentPrice,
			Integer rentPriceDescripsion, String managerName, String managerPhoneNumber) {
		this.name = name;
		this.street = street;
		this.ward = ward;
		this.districtId = districtId;
		this.structe = structe;
		this.numberOfBasement = numberOfBasement;
		this.floorArea = floorArea;
		this.direction = direction;
		this.level = level;
		this.rentPrice = rentPrice;
		this.rentPriceDescripsion = rentPriceDescripsion;
		this.managerName = managerName;
		this.managerPhoneNumber = managerPhoneNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getWard() {
		return ward;
	}

	public void setWard(String ward) {
		this.ward = ward;
	}

	public Integer getDistrictId() {
		return districtId;
	}

	public void setDistrictId(Integer districtId) {
		this.districtId = districtId;
	}

	public String getStructe() {
		return structe;
	}

	public void setStructe(String structe) {
		this.structe = structe;
	}

	public Integer getNumberOfBasement() {
		return numberOfBasement;
	}

	public void setNumberOfBasement(Integer numberOfBasement) {
		this.numberOfBasement = numberOfBasement;
	}

	public Double getFloorArea() {
		return floorArea;
	}

	public void setFloorArea(Double floorArea) {
		this.floorArea = floorArea;
	}

	public String getDirection() {
		return direction;
	}

	public void setDirection(String direction) {
		this.direction = direction;
	}

	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level;
	}

	public Integer getRentPrice() {
		return rentPrice;
	}

	public void setRentPrice(Integer rentPrice) {
		this.rentPrice = rentPrice;
	}

	public Integer getRentPriceDescripsion() {
		return rentPriceDescripsion;
	}

	public void setRentPriceDescripsion(Integer rentPriceDescripsion) {
		this.rentPriceDescripsion = rentPriceDescripsion;
	}

	public String getManagerName() {
		return managerName;
	}

	public void setManagerName(String managerName) {
		this.managerName = managerName;
	}

	public String getManagerPhoneNumber() {
		return managerPhoneNumber;
	}

	public void setManagerPhoneNumber(String managerPhoneNumber) {
		this.managerPhoneNumber = managerPhoneNumber;
	}
	
	
	
	
	
	
}
