package com.dontwait.spring_boot_non_jwt.repositories.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.dontwait.spring_boot_non_jwt.entity.Building;
import com.dontwait.spring_boot_non_jwt.repositories.BuildingRepository;

@Repository
public class BuildingRepositoryImpl implements BuildingRepository{
	static final String DB_URL = "jdbc:mysql://localhost:3306/estatebasic";
	static final String USER = "root";
	static final String PASS = "sa123";
	
	@Override
	public List<Building> findAll(String name) {
		// TODO Auto-generated method stub
		//Xu li duoi db rui`
		List<Building> result = new ArrayList<Building>();
		String sql = "SELECT * FROM building where name LIKE'%" + name + "%'";
		try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
				Statement stm = conn.createStatement();
				ResultSet rs = stm.executeQuery(sql);) {
			
			while(rs.next()) {
				Building building= new Building();
				building.setName(rs.getString("name"));
				building.setStreet(rs.getString("street"));
				building.setWard(rs.getString("ward"));
				building.setNumberOfBasement(rs.getInt("numberofbasement"));
				result.add(building);
			}
			
			
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Connected failed");

		}		
		return result;
	}

}
