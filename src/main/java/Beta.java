
public class Beta extends Thread {
	
	public void printBeta()
	{
		System.out.println("Hello from Beta");
	}
	
	@Override
	public void run()
	{
		printBeta();
	}

}
