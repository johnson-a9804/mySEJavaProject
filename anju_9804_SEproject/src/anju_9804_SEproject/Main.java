package anju_9804_SEproject;

import java.util.Scanner;

public class Main {
	
	private static Driver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Welcome to Parking Booking System!!");
		System.out.println("");
		System.out.println("Please input your choice (1-3): ");
		System.out.println("1. Reserve Parking Space" + "\n"+
						   "2. Cancel your booking" + "\n" +
						   "3. Exit");
		try {
			
		
		Scanner input = new Scanner(System.in);
		int choice = input.nextInt();
		
		switch(choice)
		{
			case 1:
				reserveParking();
				break;
			case 2:
				cancelBooking();
				break;
			case 3:
				System.out.println("Thank you!!");
				System.exit(0);;
				break;
			default:
				System.out.println("Invalid input!!" + "\n" + "Try again");
				break;
			
		}
		}catch(Exception e)
		{
			System.out.println("Something went wrong!!");
		}
		

	}
	
	public static void reserveParking()
	{
		try {
			
		
		System.out.print("Enter your username: ");
		Scanner input = new Scanner(System.in);
		String user = input.nextLine();
		System.out.println("");
		System.out.print("Enter your password: ");
		String password = input.nextLine();
		System.out.println("");
		System.out.print("Enter your DOB: ");
		String dob = input.nextLine();
		System.out.println("");
		System.out.print("Enter your Drivers License Id: ");
		long lic = input.nextLong();
		System.out.println("");
		
		driver = new Driver(user, password, dob, lic);
		
		System.out.print("Enter your vehicle Id: ");
		long vehicleId = input.nextLong();
		System.out.println("");
		System.out.print("Enter the type of vehicle: ");
		Scanner in = new Scanner(System.in);
		String type = in.nextLine();
		System.out.println("");
		
		Vehicle vehicle = new Vehicle(vehicleId, type, user);
		
		driver.reserve();
		
		}
		catch(Exception c)
		{
			System.out.println("Something went wrong!!");
		}
		
	}
	
	public static void cancelBooking()
	{
		System.out.println("Successfully Cancelled!!");
	}

}
