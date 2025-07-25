package model.entities;

import model.exception.CapacityExceededException;

public class PassengerVehicle extends Vehicle{
	
	private String passengerType;
	private Integer requested;

	public PassengerVehicle(String plate, Integer requested, Integer capacity, String passengerType) {
		super(plate, capacity);
		this.passengerType = passengerType;
		this.requested = requested;
	}

	public String getPassengerType() {
		return passengerType;
	}

	public void setPassengerType(String passengerType) {
		this.passengerType = passengerType;
	}
		
	public Integer getRequested() {
		return requested;
	}

	public void setRequested(Integer requested) {
		this.requested = requested;
	}

	@Override
	public void checkCapacity (Integer requested) throws CapacityExceededException {
		if (requested > getCapacity()) {
			throw new CapacityExceededException("ERROR: CapacityExceededException - Passenger limit exceeded: " 
					+ getCapacity() + " max.");
		}
	}

	@Override
	public String info() {
		return "Vehicle " + getPlate() + " accepted passengers to board of " + requested + " passengers.";
	}
	
	
	
}
