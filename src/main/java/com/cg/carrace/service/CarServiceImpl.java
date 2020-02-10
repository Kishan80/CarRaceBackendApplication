/**
 * 
 */
package com.cg.carrace.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.carrace.entity.CarBean;
import com.cg.carrace.exception.InvalidCarException;
import com.cg.carrace.repo.CarRepo;

/**
 * @author kneware
 *
 */
@Service
public class CarServiceImpl implements CarService {

	/* Creating reference of CarRepo using dependency injection. */
	@Autowired
	CarRepo carrepo;

	/* Implementation of all methods declared in Interface CarService */

	@Override
	public CarBean addCar(CarBean carbean) {

		return carrepo.save(carbean);
	}

	@Override
	public List<CarBean> getAllCars() {

		return (List<CarBean>) carrepo.findAll();
	}

	@Override
	public CarBean updateCar(CarBean carbean) {

		return carrepo.save(carbean);
	}

	/*
	 * This method will delete Car by Car Id if same Car Id is present in table
	 * otherwise it will return "No such Car Available".
	 */
	@Override
	public boolean removeCar(int carId) throws InvalidCarException {
		try {
			if (carrepo.findById(carId).get() != null)
				carrepo.deleteById(carId);
			return true;
		} catch (Exception e) {

			throw new InvalidCarException("No such Car Available");
		}

	}

}
