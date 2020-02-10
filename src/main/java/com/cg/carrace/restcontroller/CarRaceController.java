package com.cg.carrace.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.carrace.entity.CarBean;
import com.cg.carrace.exception.InvalidCarException;
import com.cg.carrace.service.CarService;

/*@CrossOrigin annotation will integrate spring boot application with angular*/
@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class CarRaceController {

	/* Creating reference of CarService using dependency injection. */
	@Autowired
	CarService carservice;

	/* Using HTTP request methods handling HTTP requests and responses. */

	@PostMapping(value = "/car", consumes = "application/json")
	public CarBean addCar(@RequestBody CarBean carbean) {
		return carservice.addCar(carbean);
	}

	@GetMapping(value = "/car", produces = "application/json")
	List<CarBean> getAllCars() {
		return carservice.getAllCars();
	}

	@PutMapping(value = "/car", consumes = "application/json")
	CarBean updateCar(@RequestBody CarBean carbean) {
		return carservice.updateCar(carbean);
	}

	@DeleteMapping(value = "/car/{carId}")
	boolean removeCar(@PathVariable int carId) throws InvalidCarException {
		return carservice.removeCar(carId);
	}
}
