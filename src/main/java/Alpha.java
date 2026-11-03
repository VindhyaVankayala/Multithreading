
public class Alpha extends Thread {
	
	public void printAlpha()
	{
		System.out.println("From Alpha class");
		
	}
	
	@Override
	public void run()
	{
		printAlpha();
	}

}
