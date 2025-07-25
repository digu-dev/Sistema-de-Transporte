package model.exception;

public class CapacityExceededException extends Exception{

	private static final long serialVersionUID = 1L;
		
	public CapacityExceededException (String msg) {
			super(msg);
		}
}



/*public void checkCapacity (Integer requested) throws CapacityExceededException {
	if (requested > capacity) {
		throw new CapacityExceededException("ERROR: CapacityExceededException - Passenger limit exceeded: " 
				+ capacity + " max.");
	}
}

*/