package com.dontwait.spring_boot_non_jwt.models;

import java.util.List;

public class BuildingSearchRequest {
	private String name;
	private Double floorArea;
	private Integer districtId;
	private String ward;
	private String street;
	private Integer numberOfBasement;
	private String direction;
	private String level;
	private Double areaFrom;
	private Double areaTo;
	private Integer rentPriceFrom;
	private Integer rentPriceTo;
	private String managerName;
	private String managerPhoneNumber;
	private Integer staffId;
	private List<String> rentTypeId; //code


    

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Double getFloorArea() {
        return floorArea;
    }
    public void setFloorArea(Double floorArea) {
        this.floorArea = floorArea;
    }
    public Integer getDistrictId() {
        return districtId;
    }
    public void setDistrictId(Integer districtId) {
        this.districtId = districtId;
    }
    public String getWard() {
        return ward;
    }
    public void setWard(String ward) {
        this.ward = ward;
    }
    public String getStreet() {
        return street;
    }
    public void setStreet(String street) {
        this.street = street;
    }
    public Integer getNumberOfBasement() {
        return numberOfBasement;
    }
    public void setNumberOfBasement(Integer numberOfBasement) {
        this.numberOfBasement = numberOfBasement;
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
    public Double getAreaFrom() {
        return areaFrom;
    }
    public void setAreaFrom(Double areaFrom) {
        this.areaFrom = areaFrom;
    }
    public Double getAreaTo() {
        return areaTo;
    }
    public void setAreaTo(Double areaTo) {
        this.areaTo = areaTo;
    }
    public Integer getRentPriceFrom() {
        return rentPriceFrom;
    }
    public void setRentPriceFrom(Integer rentPriceFrom) {
        this.rentPriceFrom = rentPriceFrom;
    }
    public Integer getRentPriceTo() {
        return rentPriceTo;
    }
    public void setRentPriceTo(Integer rentPriceTo) {
        this.rentPriceTo = rentPriceTo;
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
    public Integer getStaffId() {
        return staffId;
    }
    public void setStaffId(Integer staffId) {
        this.staffId = staffId;
    }
    public List<String> getRentTypeId() {
        return rentTypeId;
    }
    public void setRentTypeId(List<String> rentTypeId) {
        this.rentTypeId = rentTypeId;
    }

    
}
