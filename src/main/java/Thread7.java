
public class Thread7 {
	
	public static void main(String[] args) {
		
		DeadlockDemo library = new DeadlockDemo();
		Thread t1 = new Thread(library);
		Thread t2 = new Thread(library);
		
		t1.setName("Vindhya");
		t2.setName("Ankit");
		
		t1.start();
		t2.start();
		
		
	}

}
