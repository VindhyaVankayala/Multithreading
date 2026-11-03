
public class Thread3 {
	
	public static void main(String[] args) {
		
		EnrollCourse course = new EnrollCourse();
		
		PrintJob printJob = new PrintJob();
		
		Thread t1 = new Thread(course);
		Thread t2 = new Thread(printJob);
		
		System.out.println("t1 is alive : " + t1.isAlive());
		System.out.println("t2 is alive : " + t2.isAlive());
		
		t1.start();
		t2.start();
		
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		System.out.println("t1 is alive: " + t1.isAlive());
		System.out.println("t2 is alive: " + t2.isAlive());
		
		System.out.println("main started");
		
	}

}
