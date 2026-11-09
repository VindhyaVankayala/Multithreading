
public class ParkCarWithSynchObj implements Runnable {
	
	@Override
	public void run()
	{
		try
		{
			System.out.println(Thread.currentThread().getName() + " has entered parking lot");
			Thread.sleep(2000);
			
			synchronized(this)
			{
				System.out.println(Thread.currentThread().getName() + " has entered inside the car");
				System.out.println(Thread.currentThread().getName() + " has started driving");
				System.out.println(Thread.currentThread().getName() + " has come back and parked the car");
				System.out.println(Thread.currentThread().getName() + " has exited the car");
			}
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		
	}

}
