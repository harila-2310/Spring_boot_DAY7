package com.example.demo.model.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.model.CarEntity;

public interface CarRepo extends JpaRepository<CarEntity, Integer> {

	@Query(value="select * from car_table where owners=:s",nativeQuery=true)
	public List<CarEntity> getCarInfo(@Param("s") int id);
	
	@Query(value="select * from car_table where address=:s",nativeQuery=true)
	public List<CarEntity> getaddInfo(@Param("s") String add);
	
	@Query(value="select * from car_table where carname=:s",nativeQuery=true)
	public List<CarEntity> getcnameInfo(@Param("s") String cname);
	
	@Query(value="select * from car_table where owners=:s and cartype=:d",nativeQuery=true)
	public List<CarEntity> getOwnerAndCarInfo(@Param("s") int id,@Param("d") String st);
	
}
