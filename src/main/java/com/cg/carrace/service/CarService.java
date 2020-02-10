package com.cg.carrace.service;

import java.util.List;

import com.cg.carrace.entity.CarBean;
import com.cg.carrace.exception.InvalidCarException;

public interface CarService {

	/* This method will add Car details */
	public CarBean addCar(CarBean carbean);

	/* This method will show Car list */
	public List<CarBean> getAllCars();

	/* This method will update Car details */
	public CarBean updateCar(CarBean carbean);

	/* This method will remove Car details */
	boolean removeCar(int carId) throws InvalidCarException;

}
