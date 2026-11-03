
public class Thread1 {
	
	public static void main(String[] args) {
		
		System.out.println("Current thread started");
		Thread t1 = Thread.currentThread();
		System.out.println("Thread name is " + t1.getName());
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Thread priority is " + t1.getPriority());
		System.out.println("Setting thread name to Vindhya");
		t1.setName("Vindhya");
		System.out.println("New name is " + t1.getName());
		System.out.println("Thread ending");
		
		
	}

}
