
public class Gaama extends Thread{
	
	public void printGaama()
	{
		System.out.println("Hello from Gaama");
	}
	
	@Override
	public void run()
	{
		printGaama();
	}

}
