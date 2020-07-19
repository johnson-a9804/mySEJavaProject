package anju_9804_SEproject;

import java.util.Date;
import java.util.Scanner;

public class Driver implements Reservation {
	
	private String userId;
	private String password;
	private String DOB;
	private long drivers_license;
	
	public Driver(String userId, String password, String dob, long drivers_license) {
		super();
		this.userId = userId;
		this.password = password;
		this.DOB = dob;
		this.drivers_license = drivers_license;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getDOB() {
		return DOB;
	}

	public void setDOB(String dOB) {
		DOB = dOB;
	}

	public long getDrivers_license() {
		return drivers_license;
	}

	public void setDrivers_license(long drivers_license) {
		this.drivers_license = drivers_license;
	}
	
	

	public void reserve() {
		System.out.println("Enter your location");
		try {
			Vehicle v = new Vehicle();
			
			Scanner inp = new Scanner(System.in);
			String loc = inp.nextLine();
			System.out.println("Please validate your location: (1/2)");
			System.out.println("Driver name: " + getUserId());
			System.out.println("Date of Birth: " + getDOB());
			
			System.out.println("Chosen Location: " +loc);
			int ch = inp.nextInt();
			if(ch == 1)
			{
				System.out.println("Successfully Registered");
			}
			else if(ch == 2)
			{
				System.out.println("Please re-enter your location: ");
				reserve();
			}
		}catch(Exception ex) {
			System.out.println("Something went wrong!!");
		}
	}
	
	public void cancel() {
		
		System.out.println("Successfully cancelled!!");
		
	}
	
}
