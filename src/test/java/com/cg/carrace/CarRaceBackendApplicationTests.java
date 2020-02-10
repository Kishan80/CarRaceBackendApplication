package com.cg.carrace;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.cg.carrace.entity.CarBean;
import com.cg.carrace.service.CarServiceImpl;

@RunWith(SpringRunner.class)
@SpringBootTest
class CarRaceBackendApplicationTests {

	@MockBean
	private CarServiceImpl carService;

	CarBean mockCar = new CarBean(1, "kishan", "BMW", "X10", "Nitro 80%", 0);
	CarBean mockCar2 = new CarBean(2, "priyam", "Ferrari", "x10", "Nitro 80%", 0);

	@Test
	public void addCarTest() throws Exception {
		Mockito.when(carService.addCar(mockCar)).thenReturn(mockCar);
		assertEquals(mockCar, carService.addCar(mockCar));
	}

	@Test
	public void getAllCars() throws Exception {

		Mockito.when(carService.getAllCars()).thenReturn(Arrays.asList(mockCar, mockCar2));
		assertEquals(2, carService.getAllCars().size());
	}

	@Test
	public void updateCarTest() throws Exception {
		Mockito.when(carService.updateCar(mockCar)).thenReturn(mockCar);
		assertEquals(mockCar, carService.updateCar(mockCar));
	}

	@Test
	public void removeCarTest() throws Exception {
		int carId = 1;
		Mockito.when(carService.removeCar(carId)).thenReturn(true);
		assertEquals(true, carService.removeCar(carId));
	}

}
