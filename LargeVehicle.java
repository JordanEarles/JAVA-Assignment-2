import java.util.Scanner;

public class LargeVehicle extends Car {
       
	static int LargeVehNumber = 0;
    static int DisLV = 0;
    static int FamLV = 0;
    static boolean DisLVehicle = false;
	static boolean FamLVehicle = false;
	
	public static void LVPark() {
		Scanner input = new Scanner(System.in);
		int Menu;
		
		do {
			System.out.println("Do either of the folliwing apply to you?");
			System.out.println("1: Parking in a Disabled Space");
			System.out.println("2: Parking in a Family Space");
			System.out.println("3: Neither of these apply");
			
			Menu = input.nextInt();
			
			switch (Menu) {
			case 1: {
				DisLVehicle = true;
				break;
			}
			case 2: {
				FamLVehicle = true;
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
		if (DisLVehicle) {
		    DisLV = 1;
		    ParkingPlaza.OccupiedSpaces = ParkingPlaza.OccupiedSpaces + 1;	
		    ParkingPlaza.TotalDisabledSpaces = ParkingPlaza.TotalDisabledSpaces - DisLV;
		}
		else if (FamLVehicle) {
			FamLV = 1; 
			ParkingPlaza.OccupiedSpaces = ParkingPlaza.OccupiedSpaces + 1;		
			ParkingPlaza.TotalFamilySpaces = ParkingPlaza.TotalFamilySpaces - FamLV;
		}
		else {
			ParkingPlaza.OccupiedSpaces = ParkingPlaza.OccupiedSpaces + 2;    //LargeVehicles take up 2 spaces
		}
		LargeVehNumber = LargeVehNumber + 1;
		System.out.println("Total Large Vehicles = " + LargeVehNumber);
		LargeVehicle.VehicleEnter();
	}
	public static void LVLeave() {
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
				DisLVehicle = true;
				break;
			}
			case 2: {
				FamLVehicle = true;
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
		if (DisLVehicle) {
		    DisLV = 1;
		    ParkingPlaza.OccupiedSpaces = ParkingPlaza.OccupiedSpaces - 1;	
		    ParkingPlaza.TotalDisabledSpaces = ParkingPlaza.TotalDisabledSpaces + DisLV;
		}
		else if (FamLVehicle) {
			FamLV = 1; 
			ParkingPlaza.OccupiedSpaces = ParkingPlaza.OccupiedSpaces - 1;		
			ParkingPlaza.TotalFamilySpaces = ParkingPlaza.TotalFamilySpaces + FamLV;
		}
		else {
			ParkingPlaza.OccupiedSpaces = ParkingPlaza.OccupiedSpaces - 2;    //LargeVehicles take up 2 spaces
		}
		LargeVehNumber = LargeVehNumber - 1;
		System.out.println("Total Large Vehicles = " + LargeVehNumber);
		LargeVehicle.VehicleLeave();
	}
	}
