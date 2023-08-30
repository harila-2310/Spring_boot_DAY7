package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="car_table")
public class CarEntity {

	@Id
	@GeneratedValue
	private int id;
	private String carname;
	private String cartype;
	private int owners;
	private String currentOwnerName;
	private long mobile;
	private String address;
	public CarEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CarEntity(int id, String carName, String carType, int owners, String currentOwnerName, long mobile,
			String address) {
		super();
		this.id = id;
		this.carname = carName;
		this.cartype = carType;
		this.owners = owners;
		this.currentOwnerName = currentOwnerName;
		this.mobile = mobile;
		this.address = address;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCarName() {
		return carname;
	}
	public void setCarName(String carName) {
		this.carname = carName;
	}
	public String getCarType() {
		return cartype;
	}
	public void setCarType(String carType) {
		this.cartype = carType;
	}
	public int getOwners() {
		return owners;
	}
	public void setOwners(int owners) {
		this.owners = owners;
	}
	public String getCurrentOwnerName() {
		return currentOwnerName;
	}
	public void setCurrentOwnerName(String currentOwnerName) {
		this.currentOwnerName = currentOwnerName;
	}
	public long getMobile() {
		return mobile;
	}
	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	


}
