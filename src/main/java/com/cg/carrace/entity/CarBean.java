/**
 * 
 */
package com.cg.carrace.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author kneware
 *
 */
@Entity
@Table(name = "Cars")
public class CarBean {

	/*Attributes for Car model*/
	
	@Id
	@GeneratedValue
	@Column(name = "carId")
	private int carId;

	@Column(name = "pilot")
	private String pilot;

	@Column(name = "brand")
	private String brand;

	@Column(name = "model")
	private String model;

	@Column(name = "superpower")
	private String superpower;

	@Column(name = "numofpoints")
	private int numofpoints;

	/**
	 * @return the carId
	 */
	public int getCarId() {
		return carId;
	}

	/**
	 * @param carId the carId to set
	 */
	public void setCarId(int carId) {
		this.carId = carId;
	}

	/**
	 * @return the pilot
	 */
	public String getPilot() {
		return pilot;
	}

	/**
	 * @param pilot the pilot to set
	 */
	public void setPilot(String pilot) {
		this.pilot = pilot;
	}

	/**
	 * @return the brand
	 */
	public String getBrand() {
		return brand;
	}

	/**
	 * @param brand the brand to set
	 */
	public void setBrand(String brand) {
		this.brand = brand;
	}

	/**
	 * @return the model
	 */
	public String getModel() {
		return model;
	}

	/**
	 * @param model the model to set
	 */
	public void setModel(String model) {
		this.model = model;
	}

	/**
	 * @return the superpower
	 */
	public String getSuperpower() {
		return superpower;
	}

	/**
	 * @param superpower the superpower to set
	 */
	public void setSuperpower(String superpower) {
		this.superpower = superpower;
	}

	/**
	 * @return the numofpoints
	 */
	public int getNumofpoints() {
		return numofpoints;
	}

	/**
	 * @param numofpoints the numofpoints to set
	 */
	public void setNumofpoints(int numofpoints) {
		this.numofpoints = numofpoints;
	}

	/**
	 * @param carId
	 * @param pilot
	 * @param brand
	 * @param model
	 * @param superpower
	 * @param numofpoints
	 */
	public CarBean(int carId, String pilot, String brand, String model, String superpower, int numofpoints) {
		super();
		this.carId = carId;
		this.pilot = pilot;
		this.brand = brand;
		this.model = model;
		this.superpower = superpower;
		this.numofpoints = numofpoints;
	}

	/**
	 * 
	 */
	public CarBean() {
		super();
	}

	
	
}
