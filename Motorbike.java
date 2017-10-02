
public class Motorbike extends ParkingPlaza {

	static int BikeNumber = 0;
		
	public static void BikePark() {
		ParkingPlaza.OccupiedSpaces = 0;
		ParkingPlaza.OccupiedSpaces = ParkingPlaza.OccupiedSpaces + 1;
		BikeNumber = BikeNumber + 1;
		Motorbike.VehicleEnter();	
		System.out.println("Total Motorbikes = " + BikeNumber);
		}
	
	public static void BikeLeave() {
		ParkingPlaza.OccupiedSpaces = 1;
		BikeNumber = BikeNumber - 1;
		Motorbike.VehicleLeave();
		System.out.println("Total Motorbikes = " + BikeNumber);
	}
	}
