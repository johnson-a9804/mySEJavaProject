package anju_9804_SEproject;

public class Vehicle {
	
	private long vehicleId;
	private String vehicleType;
	private String ownerName;
	
	
	public Vehicle(long vehicleId, String vehicleType, String ownerName) {
		super();
		this.vehicleId = vehicleId;
		this.vehicleType = vehicleType;
		this.ownerName = ownerName;
	}


	public Vehicle() {
		super();
	}


	public Vehicle(long vehicleId, String vehicleType) {
		super();
		this.vehicleId = vehicleId;
		this.vehicleType = vehicleType;
	}


	public long getVehicleId() {
		return vehicleId;
	}


	public void setVehicleId(long vehicleId) {
		this.vehicleId = vehicleId;
	}


	public String getVehicleType() {
		return vehicleType;
	}


	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}


	public String getOwnerName() {
		return ownerName;
	}


	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	
	
	public Vehicle getVehicleDetails()
	{
		
		Vehicle v = new Vehicle(getVehicleId(), getVehicleType());
		return v;
	}
	

}
