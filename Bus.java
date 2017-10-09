
public class Bus extends ParkingPlaza{

	public static int BusNumber =0;
	
	public static void BusPark() {
		ParkingPlaza.OccupiedSpaces = 0;
		ParkingPlaza.OccupiedSpaces = ParkingPlaza.OccupiedSpaces + 1;
		BusNumber = BusNumber + 1;
		Motorbike.VehicleEnter();	
		System.out.println("Total Buses = " + BusNumber);
		}
	
	public static void BusLeave() {
		ParkingPlaza.OccupiedSpaces = 1;
		BusNumber = BusNumber - 1;
		Motorbike.VehicleLeave();
		System.out.println("Total Buses = " + BusNumber);
	}
}
