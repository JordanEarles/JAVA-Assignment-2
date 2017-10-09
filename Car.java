import java.util.Scanner;

public class Car extends Motorbike {

	static int CarNumber = 0;
	static int DisCar = 0;
	static int FamCar = 0;
	static boolean DisVehicle = false;
	static boolean FamVehicle = false;
	
	public static void CarPark() {
		Scanner input = new Scanner(System.in);
		int Menu;
		
		do {
			System.out.println("Do either of the following apply to you?");
			System.out.println("1: Parking in a Disabled Space");
			System.out.println("2: Parking in a Family Space");
			System.out.println("3: Neither of these apply");
			
			Menu = input.nextInt();
			
			switch (Menu) {
			case 1: {
				DisVehicle = true;
				break;
			}
			case 2: {
				FamVehicle = true;
				break;
			}
			case 3: {	
				break;
			}
			default: {
				break;
			}
			}
			break;
		} while (Menu !=0);
		
		ParkingPlaza.OccupiedSpaces = 0;
	    if (DisVehicle) {
		    DisCar = 1;
		    ParkingPlaza.TotalDisabledSpaces = ParkingPlaza.TotalDisabledSpaces - DisCar;
		    DisVehicle = false;
		}
		else if (FamVehicle) {
			FamCar = 1; 
			ParkingPlaza.TotalFamilySpaces = ParkingPlaza.TotalFamilySpaces - FamCar;
			FamVehicle = false;
		}
		else; {}
		ParkingPlaza.OccupiedSpaces = ParkingPlaza.OccupiedSpaces + 1;
		CarNumber = CarNumber + 1;
		System.out.println("Total Cars = " + CarNumber);
		Car.VehicleEnter();
	}
	
	public static void CarLeave() {
		Scanner input = new Scanner(System.in);
		int Menu;
		
		do {
			System.out.println("Did either of the following apply to you?");
			System.out.println("1: Parked in a Disabled Space");
			System.out.println("2: Parked in a Family Space");
			System.out.println("3: Neither of those applied");
			
			Menu = input.nextInt();
			
			switch (Menu) {
			case 1: {
				DisVehicle = true;
				break;
			}
			case 2: {
				FamVehicle = true;
				break;
			}
			case 3: {	
				break;
			}
			default: {
				break;
			}
			}
			break;
		} while (Menu !=0);
		ParkingPlaza.OccupiedSpaces = 1;
		if (DisVehicle) {
		    DisCar = 1;
		    ParkingPlaza.TotalDisabledSpaces = ParkingPlaza.TotalDisabledSpaces + DisCar;
		}
		else if (FamVehicle) {
			FamCar = 1; 
			ParkingPlaza.TotalFamilySpaces = ParkingPlaza.TotalFamilySpaces + FamCar;
		}
		else; {}
		ParkingPlaza.OccupiedSpaces = ParkingPlaza.OccupiedSpaces - 1;
		CarNumber = CarNumber - 1;
		System.out.println("Total Cars = " + CarNumber);
		Car.VehicleLeave();
			
		}
	}
