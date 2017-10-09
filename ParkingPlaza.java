import java.util.Scanner;
public class ParkingPlaza {

	static int VehicleType;
	static int TotalDisabledSpaces = 75;         //Wider spaces accomadates all Vehicles 
	static int TotalFamilySpaces = 75;           //Wider spaces accomadates all vehicles
	static double TotalVehicleSpaces = 400;         //Motorbikes + Cars = 1, Large Vehicles = 2;
    static double OccupiedSpaces = 0;
    boolean isMotorbike = false;
    boolean isCar = false;
    boolean isLV = false;
    int level;
    
private String VehReg;
private String VehModel;
	
	public ParkingPlaza() {
	}
	
	public void setVehReg(String VehReg) {
		this.VehReg = VehReg;
	}
	
	public String getVehReg() {
		return VehReg;
	}
	
	public void setVehModel(String model) {
		this.VehModel = model;
	}
	
	public String getVehModel() {
		return VehModel;
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
			System.out.println("B = Bus");
			System.out.println("M = Motorbike");
			System.out.println("C = Car");
			System.out.println("L = Larger Vehicle (Ex: Van)");
			VehType = input.next();
				if(VehType.equals("M")) {
					VehicleType = 1;
					System.out.println("Please enter your Vehicle Registration:");
					String VehReg = input.next();
					System.out.println("Please enter your Vehicle Model:");
					String VehModel = input.next();
					System.out.println("Which level would you like to park on?");
					System.out.println("1 = Floor 1");
					System.out.println("2 = Floor 2");
					System.out.println("3 = Floor 3");
					System.out.println("4 = Floor 4");
					int floorSelect = input.nextInt();
					if ((Level1.bikeSpots == 0) && (Level2.bikeSpots == 0) && (Level3.bikeSpots == 0) && (Level4.bikeSpots == 0) ) {
						System.out.println("Sorry there are no available Bike spaces at this time, please try again later.");
						return;
					}
						else {
						if (floorSelect == 1) {
							if (Level1.bikeSpots > 0)
								Motorbike.BikePark();
							System.out.println("Welcome to the Parking Plaza! Enjoy your stay!");
							Level1.bikeSpots = Level1.bikeSpots - 1;
						}
						else {
							System.out.println("Sorry there are no available Bike Spaces on Floor 1, please select another floor.");
							return;
						}
						if (floorSelect == 2) {
							if (Level2.bikeSpots > 0)
								Motorbike.BikePark();
							System.out.println("Welcome to the Parking Plaza! Enjoy your stay!");
							Level2.bikeSpots = Level2.bikeSpots - 1;
						}
						else {
							System.out.println("Sorry there are no available Bike Spaces on Floor 2, please select another floor.");
							return;
						}
						if (floorSelect == 3) {
							if (Level3.bikeSpots > 0)
								Motorbike.BikePark();
							System.out.println("Welcome to the Parking Plaza! Enjoy your stay!");
							Level3.bikeSpots = Level3.bikeSpots - 1;
						}
						else {
							System.out.println("Sorry there are no available Bike Spaces on Floor 3, please select another floor.");
							return;
						}
						if (floorSelect == 4) {
							if (Level4.bikeSpots > 0)
								Motorbike.BikePark();
							System.out.println("Welcome to the Parking Plaza! Enjoy your stay!");
							Level4.bikeSpots = Level4.bikeSpots - 1;
						}
						else {
							System.out.println("Sorry there are no available Bike Spaces on Floor 4, please select another floor.");
							return;
						}
						}
						}
				else if(VehType.equals("C")) {
					VehicleType = 2;
					System.out.println("Please enter your Vehicle Registration:");
					String VehReg = input.next();
					System.out.println("Please enter your Vehicle Model:");
					String VehModel = input.next();
					System.out.println("Which level would you like to park on?");
					System.out.println("1 = Floor 1");
					System.out.println("2 = Floor 2");
					System.out.println("3 = Floor 3");
					System.out.println("4 = Floor 4");
					int floorSelect = input.nextInt();
					if ((Level1.carSpots == 0) && (Level2.carSpots == 0) && (Level3.carSpots == 0) && (Level4.carSpots == 0) ) {
						System.out.println("Sorry there are no available Car spaces at this time, please try again later.");
						return;
					}
						else {
						if (floorSelect == 1) {
							if (Level1.carSpots > 0)
								Car.CarPark();
							System.out.println("Welcome to the Parking Plaza! Enjoy your stay!");
							Level1.carSpots = Level1.carSpots - 1;
						}
						else {
							System.out.println("Sorry there are no available Car Spaces on Floor 1, please select another floor.");
							return;
						}
						if (floorSelect == 2) {
							if (Level2.carSpots > 0)
								Car.CarPark();
							System.out.println("Welcome to the Parking Plaza! Enjoy your stay!");
							Level2.carSpots = Level2.carSpots - 1;
						}
						else {
							System.out.println("Sorry there are no available Car Spaces on Floor 2, please select another floor.");
							return;
						}
						if (floorSelect == 3) {
							if (Level3.carSpots > 0)
								Car.CarPark();
							System.out.println("Welcome to the Parking Plaza! Enjoy your stay!");
							Level3.carSpots = Level3.carSpots - 1;
						}
						else {
							System.out.println("Sorry there are no available Car Spaces on Floor 3, please select another floor.");
							return;
						}
						if (floorSelect == 4) {
							if (Level4.carSpots > 0)
								Car.CarPark();
							System.out.println("Welcome to the Parking Plaza! Enjoy your stay!");
							Level4.carSpots = Level4.carSpots - 1;
						}
						else {
							System.out.println("Sorry there are no available Car Spaces on Floor 4, please select another floor.");
							return;
						}
						}
						}
				else if(VehType.equals("L")) {
					VehicleType = 3;
					System.out.println("Please enter your Vehicle Registration:");
					String VehReg = input.next();
					System.out.println("Please enter your Vehicle Model:");
					String VehModel = input.next();
					System.out.println("Which level would you like to park on?");
					System.out.println("1 = Floor 1");
					System.out.println("2 = Floor 2");
					System.out.println("3 = Floor 3");
					int floorSelect = input.nextInt();
					if ((Level1.largeSpots == 0) && (Level2.largeSpots == 0) && (Level3.largeSpots == 0)) {
						System.out.println("Sorry there are no available Large Vehicle spaces at this time, please try again later.");
						return;
					}
						else {
						if (floorSelect == 1) {
							if (Level1.largeSpots > 0)
								LargeVehicle.LVPark();
							System.out.println("Welcome to the Parking Plaza! Enjoy your stay!");
							Level1.largeSpots = Level1.largeSpots - 1;
						}
						else {
							System.out.println("Sorry there are no available Large Vehicle Spaces on Floor 1, please select another floor.");
							return;
						}
						if (floorSelect == 2) {
							if (Level2.largeSpots > 0)
								LargeVehicle.LVPark();
							System.out.println("Welcome to the Parking Plaza! Enjoy your stay!");
							Level2.largeSpots = Level2.largeSpots - 1;
						}
						else {
							System.out.println("Sorry there are no available Large Vehicle Spaces on Floor 2, please select another floor.");
							return;
						}
						if (floorSelect == 3) {
							if (Level3.largeSpots > 0)
								LargeVehicle.LVPark();
							System.out.println("Welcome to the Parking Plaza! Enjoy your stay!");
							Level3.largeSpots = Level3.largeSpots - 1;
						}
						else {
							System.out.println("Sorry there are no available Large Vehicle Spaces on Floor 3, please select another floor.");
							return;
						}
				}
				}
				else if(VehType.equals("B")) {
					VehicleType = 4;
					System.out.println("Please enter your Vehicle Registration:");
					String VehReg = input.next();
					System.out.println("Please enter your Vehicle Model:");
					String VehModel = input.next();
					System.out.println("Which level would you like to park on?");
					System.out.println("1 = Floor 1");
					System.out.println("2 = Floor 2");
					int floorSelect = input.nextInt();
					if ((Level1.busSpots == 0) && (Level2.busSpots == 0)) {
						System.out.println("Sorry there are no available Bus spaces at this time, please try again later.");
						return;
					}
					else {
					if (floorSelect == 1) {
						if (Level1.busSpots > 0)
							Bus.BusPark();
						System.out.println("Welcome to the Parking Plaza! Enjoy your stay!");
						Level1.busSpots = Level1.busSpots - 1;
					}
					else {
						System.out.println("Sorry there are no available Bus Spaces on Floor 1, please select another floor.");
						return;
					}
					if (floorSelect == 2) {
						if (Level2.busSpots > 0)
							Bus.BusPark();
						System.out.println("Welcome to the Parking Plaza! Enjoy your stay!");
						Level2.busSpots = Level2.busSpots - 1;
					}
					else {
						System.out.println("Sorry there are no available Bus Spaces on Floor 2, please select another floor.");
						return;
					}
				break;
			}
				}
		}
		case 2: {
			String VehType;
			System.out.println("Please Select your Vehicle Type:");
			System.out.println("B = Bus");
			System.out.println("M = Motorbike");
			System.out.println("C = Car");
			System.out.println("L = Larger Vehicle (Ex: Van)");
			VehType = input.next();
			if(VehType.equals("M")) {
				System.out.println("Please enter your Vehicle Registration:");
				String VehReg = input.next();
				System.out.println("Please enter your Vehicle Model:");
				String VehModel = input.next();
				System.out.println("Which level were you parked on?");
				System.out.println("1 = Floor 1");
				System.out.println("2 = Floor 2");
				System.out.println("3 = Floor 3");
				System.out.println("4 = Floor 4");
				int floorSelect = input.nextInt();
				if (floorSelect == 1) {
						Motorbike.BikeLeave();
						System.out.println("Thank you for using Parking Plaza, we hope to see you again soon!");
					Level1.bikeSpots = Level1.bikeSpots + 1;
				}
				else if (floorSelect == 2) {
					Motorbike.BikeLeave();
					System.out.println("Thank you for using Parking Plaza, we hope to see you again soon!");
				Level2.bikeSpots = Level2.bikeSpots + 1;
				}
				else if (floorSelect == 3) {
					Motorbike.BikeLeave();
					System.out.println("Thank you for using Parking Plaza, we hope to see you again soon!");
				Level3.bikeSpots = Level3.bikeSpots + 1;
				}
				else if (floorSelect == 4) {
					Motorbike.BikeLeave();
					System.out.println("Thank you for using Parking Plaza, we hope to see you again soon!");
				Level4.bikeSpots = Level4.bikeSpots + 1;
				}
				else {
					return;
				}
		    }
			else if(VehType.equals("C")) {
				System.out.println("Please enter your Vehicle Registration:");
				String VehReg = input.next();
				System.out.println("Please enter your Vehicle Model:");
				String VehModel = input.next();
				System.out.println("Which level were you parked on?");
				System.out.println("1 = Floor 1");
				System.out.println("2 = Floor 2");
				System.out.println("3 = Floor 3");
				System.out.println("4 = Floor 4");
				int floorSelect = input.nextInt();
				if (floorSelect == 1) {
						Car.CarLeave();
						System.out.println("Thank you for using Parking Plaza, we hope to see you again soon!");
					Level1.carSpots = Level1.carSpots + 1;
				}
				if (floorSelect == 2) {
					Car.CarLeave();
					System.out.println("Thank you for using Parking Plaza, we hope to see you again soon!");
				Level2.carSpots = Level2.carSpots + 1;
			}
				if (floorSelect == 3) {
					Car.CarLeave();
					System.out.println("Thank you for using Parking Plaza, we hope to see you again soon!");
				Level3.carSpots = Level3.carSpots + 1;
			}
				if (floorSelect == 4) {
					Car.CarLeave();
					System.out.println("Thank you for using Parking Plaza, we hope to see you again soon!");
				Level4.carSpots = Level4.carSpots + 1;
			}
				else {
					return;
				}
			}
			else if(VehType.equals("L")) {
				System.out.println("Please enter your Vehicle Registration:");
				String VehReg = input.next();
				System.out.println("Please enter your Vehicle Model:");
				String VehModel = input.next();
				System.out.println("Which level were you parked on?");
				System.out.println("1 = Floor 1");
				System.out.println("2 = Floor 2");
				System.out.println("3 = Floor 3");
				int floorSelect = input.nextInt();
				if (floorSelect == 1) {
						LargeVehicle.LVLeave();
						System.out.println("Thank you for using Parking Plaza, we hope to see you again soon!");
					Level1.largeSpots = Level1.largeSpots + 1;
				}
				if (floorSelect == 2) {
					LargeVehicle.LVLeave();
					System.out.println("Thank you for using Parking Plaza, we hope to see you again soon!");
				Level2.largeSpots = Level2.largeSpots + 1;
			}
				if (floorSelect == 3) {
					LargeVehicle.LVLeave();
					System.out.println("Thank you for using Parking Plaza, we hope to see you again soon!");
				Level3.largeSpots = Level3.largeSpots + 1;
			}
				else {
					return;
				}
			}
			else if(VehType.equals("B")) {
				System.out.println("Please enter your Vehicle Registration:");
				String VehReg = input.next();
				System.out.println("Please enter your Vehicle Model:");
				String VehModel = input.next();
				System.out.println("Which level were you parked on?");
				System.out.println("1 = Floor 1");
				System.out.println("2 = Floor 2");
				int floorSelect = input.nextInt();
				if (floorSelect == 1) {
						Bus.BusLeave();
						System.out.println("Thank you for using Parking Plaza, we hope to see you again soon!");
					Level1.busSpots = Level1.busSpots + 1;
				}
				if (floorSelect == 2) {
					Bus.BusLeave();
					System.out.println("Thank you for using Parking Plaza, we hope to see you again soon!");
				Level2.busSpots = Level2.busSpots + 1;
			}
				else {
					return;
				}
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
	System.out.println("Total Remaining Spaces = " + TotalVehicleSpaces);
	System.out.println();
	System.out.println("Total Disabled Spaces Remaining = " + TotalDisabledSpaces);
	System.out.println();
	System.out.println("Total Family Spaces Remaining = " + TotalFamilySpaces);
	System.out.println();
}

}


//car, van, lorry, motorbikes
//regular, larger, disabled, family