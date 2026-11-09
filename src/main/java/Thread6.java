
public class Thread6 {
	
	public static void main(String[] args) {
		
		ParkCarWithSynchObj parkObj = new ParkCarWithSynchObj();
		
		Thread t1 = new Thread(parkObj);
		Thread t2 = new Thread(parkObj);
		Thread t3 = new Thread(parkObj);
		
		t1.setName("Vindhya");
		t2.setName("Ankit");
		t3.setName("Keerthi");
		
		t1.start();
		t2.start();
		t3.start();
	}

}
