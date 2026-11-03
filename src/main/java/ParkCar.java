
public class ParkCar implements Runnable {
	
	@Override
	synchronized public void run()
	{
		
		try {
			
			System.out.println(Thread.currentThread().getName() + " has entered the parking lot");
			Thread.sleep(2000);
			System.out.println(Thread.currentThread().getName() + " has entered the car");
			Thread.sleep(2000);
			System.out.println(Thread.currentThread().getName() + " started driving the car");
			Thread.sleep(2000);
			System.out.println(Thread.currentThread().getName() + " has exited and parked the car");
			Thread.sleep(2000);
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
