package com.dontwait.spring_boot_non_jwt.entity;

public class Building {
	private Integer id;
	private String name;
	private String street;
	private String ward;
	private Integer districtId;
	private String structure;
	private Integer numberOfBasement;
	private Double floorArea;
	private String direction;
	private String level;
	private Integer rentPrice;
	private Integer rentPriceDescription;
	private String managerName;
	private String managerPhoneNumber;
	public Building() {
	}

	public Building(String name, String street, String ward, Integer districtId, String structure,
			Integer numberOfBasement, Double floorArea, String direction, String level, Integer rentPrice,
			Integer rentPriceDescription, String managerName, String managerPhoneNumber) {
		this.name = name;
		this.street = street;
		this.ward = ward;
		this.districtId = districtId;
		this.structure = structure;
		this.numberOfBasement = numberOfBasement;
		this.floorArea = floorArea;
		this.direction = direction;
		this.level = level;
		this.rentPrice = rentPrice;
		this.rentPriceDescription = rentPriceDescription;
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

	public String getstructure() {
		return structure;
	}

	public void setstructure(String structure) {
		this.structure = structure;
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

	public Integer getRentPriceDescription() {
		return rentPriceDescription;
	}

	public void setRentPriceDescription(Integer rentPriceDescription) {
		this.rentPriceDescription = rentPriceDescription;
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
