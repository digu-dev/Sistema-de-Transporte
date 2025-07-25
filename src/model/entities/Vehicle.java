package model.entities;

import model.exception.CapacityExceededException;

public abstract class Vehicle {
	
	private String plate;
	private Integer capacity;
	
	public Vehicle(String plate, Integer capacity) {
		
		this.plate = plate;
		this.capacity = capacity;
	}

	public String getPlate() {
		return plate;
	}

	public void setPlate(String plate) {
		this.plate = plate;
	}

	public Integer getCapacity() {
		return capacity;
	}

	public void setCapacity(Integer capacity) {
		this.capacity = capacity;
	}
	
	
	public abstract void checkCapacity (Integer requested) throws CapacityExceededException;
	
	public abstract String info();

}
