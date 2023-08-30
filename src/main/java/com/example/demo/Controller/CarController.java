package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Service.CarService;
import com.example.demo.model.CarEntity;

@RestController
public class CarController {

	@Autowired
	CarService cs;
	
	@PostMapping("/postdet")
	public List<CarEntity> show(@RequestBody List<CarEntity> ce)
	{
		return cs.putinfo(ce);
	}
	
	@GetMapping("/get/owners/{owners}")
	public List<CarEntity> displayOwners(@PathVariable("owners") int s )
	{
		return cs.getDetails(s);
	}
	@GetMapping("/get/address/{address}")
	public List<CarEntity> displayAdd(@PathVariable("address") String s )
	{
		return cs.getDetailsAdd(s);
	}
	@GetMapping("/get/carname/{carname}")
	public List<CarEntity> displayCname(@PathVariable("carname") String s )
	{
		return cs.getDetailsName(s);
	}
	
	@GetMapping("/get/owners/{owners}/cartype/{cartype}")
	public List<CarEntity> displayOwners(@PathVariable("owners") int s,@PathVariable("cartype") String st)
	{
		return cs.getOwnerAndCarDetails(s,st);
	}
}
