
public class Thread5 {
	
	public static void main(String[] args) {
		
		ParkCar parkCarObj = new ParkCar();
		
		Thread vindhya = new Thread(parkCarObj);
		Thread ankit = new Thread(parkCarObj);
		Thread keerthi = new Thread(parkCarObj);
		
		vindhya.setName("Vindhya");
		ankit.setName("Ankit");
		keerthi.setName("Keerthi");
		vindhya.start();
		ankit.start();
		keerthi.start();
	}

}
