package com.javacourse.project.hibernateAndJpa.Business;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javacourse.project.hibernateAndJpa.DataAccess.ICityDal;
import com.javacourse.project.hibernateAndJpa.Entities.City;

import jakarta.transaction.Transactional;

@Service
public class CityManager implements ICityService{

	private ICityDal cityDal;
	
	@Autowired
	public CityManager(ICityDal cityDal) {
		this.cityDal = cityDal;
	}

	@Override
	@Transactional
	public List<City> GetAll() {
		return this.cityDal.GetAll();
	}

	@Override
	@Transactional
	public void add(City city) {
		//business
		this.cityDal.add(city);
		
	}

	@Override
	@Transactional
	public void update(City city) {
		
		this.cityDal.update(city);
		
	}

	@Override
	@Transactional
	public void delete(City city) {

		this.cityDal.delete(city);
		
	}

	@Override
	public City getById(int id) {
		return null;
	}

}