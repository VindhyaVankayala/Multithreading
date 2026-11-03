
public class PrintJob implements Runnable{
	
	public void printStars()
	{
		for(int i=0; i<5; i++)
		{
			System.out.println("*");
		}
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		printStars();
		
	}

	
}
