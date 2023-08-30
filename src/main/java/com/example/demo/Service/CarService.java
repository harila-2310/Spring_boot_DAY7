package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.CarEntity;
import com.example.demo.model.Repository.CarRepo;

@Service 
public class CarService {

	@Autowired
	CarRepo cr;
	
	public List<CarEntity> putinfo(List<CarEntity> ce)
	{
		return cr.saveAll(ce);
	}
	
	public List<CarEntity> getDetails(int s)
	{
		return cr.getCarInfo(s);
	}
	public List<CarEntity> getDetailsAdd(String s)
	{
		return cr.getaddInfo(s);
	}
	public List<CarEntity> getDetailsName(String s)
	{
		return cr.getcnameInfo(s);
	}
	public List<CarEntity> getOwnerAndCarDetails(int id,String s)
	{
		return cr.getOwnerAndCarInfo(id, s);
	}
}
