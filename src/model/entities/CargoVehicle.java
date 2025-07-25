package model.entities;

import model.exception.CapacityExceededException;

public class CargoVehicle extends Vehicle{
	
	private Double maxWeight;
	private Double requestedWeight;
	
	public CargoVehicle(String plate, Integer capacity, Double maxWeight, Double requestedWeight) {
		super(plate, capacity);
		this.maxWeight = maxWeight;
		this.requestedWeight = requestedWeight;
	}

	public Double getMaxWeight() {
		return maxWeight;
	}

	public void setMaxWeight(Double maxWeight) {
		this.maxWeight = maxWeight;
	}

	public Double getRequestedWeight() {
		return requestedWeight;
	}

	public void setRequestedWeight(Double requestedWeight) {
		this.requestedWeight = requestedWeight;
	}

	@Override
	public void checkCapacity (Double requested) throws CapacityExceededException {
		if (requestedWeight > getCapacity()) {
			throw new CapacityExceededException("ERROR: CapacityExceededException - Passenger limit exceeded: " 
					+ getCapacity() + " max.");
		}
	}

	@Override
	public String info() {
		return "Vehicle " + getPlate() + " accepted cargo of " + requestedWeight + " passengers.";
	}

	@Override
	public void checkCapacity(Integer requested) throws CapacityExceededException {
		return;
		
	}
	
	
	
	

}
