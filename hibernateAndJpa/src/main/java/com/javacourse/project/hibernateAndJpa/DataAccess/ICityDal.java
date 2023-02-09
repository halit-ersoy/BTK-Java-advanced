package com.javacourse.project.hibernateAndJpa.DataAccess;

import java.util.List;
import com.javacourse.project.hibernateAndJpa.Entities.City;

public interface ICityDal {
	List<City> GetAll();
	void add(City city);
	void update(City city);
	void delete(City city);
	City getBYId(int Id);
}
