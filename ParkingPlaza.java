import java.util.Scanner;
public class ParkingPlaza {
	
	static String VehicleType;
	static int TotalDisabledSpaces = 75;         //Wider spaces accomadates all Vehicles 
	static int TotalFamilySpaces = 75;           //Wider spaces accomadates all vehicles
	static int TotalVehicleSpaces = 400;         //Motorbikes + Cars = 1, Large Vehicles = 2;
    static int OccupiedSpaces = 0;
    boolean isMotorbike = false;
    boolean isCar = false;
    boolean isLV = false;
    
private String VehReg;
	
	public ParkingPlaza() {
	}
	
	public ParkingPlaza(String VehReg) {
		this.VehReg = VehReg;
	}
	
	public String getVehReg() {
		return VehReg;
	}
    
public static void VehicleEnter() {
    ParkingPlaza.TotalVehicleSpaces = ParkingPlaza.TotalVehicleSpaces - ParkingPlaza.OccupiedSpaces;
    }

public static void VehicleLeave() {
	ParkingPlaza.TotalVehicleSpaces = ParkingPlaza.TotalVehicleSpaces + ParkingPlaza.OccupiedSpaces;
}
    
public static void main(String[] args) {
	
	if (TotalVehicleSpaces == 0) {
		System.out.println("The Parking Plaza is Currently Full, Sorry for any inconvenience");
	}
	else if (TotalDisabledSpaces == 0 && TotalFamilySpaces == 0) {
		System.out.println("There are Currently No Disabled or Family Spaces left, however the regular spaces are available:");
		System.out.println("Total Remaining Spaces = " + TotalVehicleSpaces);
		System.out.println();
	}
	else if (TotalDisabledSpaces == 0) {
		System.out.println("There are Currently No Disabled Spaces left, however the following spaces are available:");
		System.out.println("Total Family Spaces Remaining = " + TotalFamilySpaces);
		System.out.println();
		System.out.println("Total Remaining Spaces = " + TotalVehicleSpaces);
		System.out.println();
	}
	else if (TotalFamilySpaces == 0) {
		System.out.println("There are Currently No Family Spaces left, however the following spaces are available:");
		System.out.println("Total Remaining Spaces = " + TotalVehicleSpaces);
		System.out.println();
	}
	else;
	System.out.println("Total Remaining Spaces = " + TotalVehicleSpaces);
	System.out.println();
	System.out.println("Total Disabled Spaces Remaining = " + TotalDisabledSpaces);
	System.out.println();
	System.out.println("Total Family Spaces Remaining = " + TotalFamilySpaces);
	System.out.println();
	
	Scanner input = new Scanner(System.in);
	int Menu;
	
	do {
		System.out.println("Welcome to the Parking Plaza! Please select from the options below:");
		System.out.println("1: Entering the Parking Plaza");
		System.out.println("2: Leaving the Parking Plaza");
		System.out.println("3: Exit Menu");
		
		Menu = input.nextInt();                //Saves User input
		
		switch (Menu) {
		case 1: {
			String VehType;
			System.out.println("Please Select your Vehicle Type:");
			System.out.println("M = Motorbike");
			System.out.println("C = Car");
			System.out.println("L = Larger Vehicle (Ex: Van)");
			VehType = input.next();
				if(VehType.equals("M")) {
					System.out.println("Please enter your Vehicle Registration:");
					String VehReg = input.next();
					Motorbike.BikePark();
					System.out.println("Welcome to the Parking Plaza! Enjoy your stay!");
			    }
				else if(VehType.equals("C")) {
					System.out.println("Please enter your Vehicle Registration:");
					String VehReg = input.next();
					Car.CarPark();
					System.out.println("Welcome to the Parking Plaza! Enjoy your stay!");
				}
				else if(VehType.equals("L")) {
					System.out.println("Please enter your Vehicle Registration:");
					String VehReg = input.next();
					LargeVehicle.LVPark();
					System.out.println("Welcome to the Parking Plaza! Enjoy your stay!");
				}
				break;
			}
		case 2: {
			String VehType;
			System.out.println("Please Select your Vehicle Type:");
			System.out.println("M = Motorbike");
			System.out.println("C = Car");
			System.out.println("L = Larger Vehicle (Ex: Van)");
			VehType = input.next();
			if(VehType.equals("M")) {
				System.out.println("Please enter your Vehicle Registration:");
				String VehReg = input.next();
				Motorbike.BikeLeave();
				System.out.println("Thank you for using the Parking Plaza!");
		    }
			else if(VehType.equals("C")) {
				System.out.println("Please enter your Vehicle Registration:");
				String VehReg = input.next();
				Car.CarLeave();
				System.out.println("Thank you for using the Parking Plaza!");
			}
			else if(VehType.equals("L")) {
				System.out.println("Please enter your Vehicle Registration:");
				String VehReg = input.next();
				LargeVehicle.LVLeave();
				System.out.println("Thank you for using the Parking Plaza!");
			}
			break;
		}
		case 3: {
			System.out.println("Thank you for using Parking Plaza, we hope to see you again soon!");
			break;
		}
		default: {
			System.out.println("Invalid, please try again");
			break;
		}
		
	}
}
	while (Menu !=0);
}
}


//car, van, lorry, motorbikes
//regular, larger, disabled, family