
public class DeadlockDemo implements Runnable{
	
	String java = new String("JAVA");
	String devops = new String("Devops");
	String aws = new String("AWS");
	
	@Override
	public void run()
	{
	
		String name = Thread.currentThread().getName();
		
		
		if(name.equals("Vindhya"))
		{
			try
			{
				System.out.println("Vindhya got in the library");
				Thread.sleep(2000);
				synchronized(java)
				{
					System.out.println("Vindhya got the java book");
					Thread.sleep(2000);
					
					synchronized (aws) {
						
						System.out.println("Vindhya got the aws book");
						Thread.sleep(2000);
						
						synchronized (devops) {
							
							System.out.println("Vindhya got the devops book");
							Thread.sleep(2000);
							
						}
					}
					
				}
				System.out.println("Vindhya exited the library");
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
			
		}
		else if(name.equals("Ankit"))
		{
			
				try
				{
					System.out.println("Ankit got in the library");
					Thread.sleep(2000);
					synchronized(aws)
					{
						System.out.println("Ankit got the aws book");
						Thread.sleep(2000);
						
						synchronized (devops) {
							
							System.out.println("Ankit got the devops book");
							Thread.sleep(2000);
							
							synchronized (java) {
								
								System.out.println("Ankit got the java book");
								Thread.sleep(2000);
								
							}
						}
						
					}
					System.out.println("Ankit exited the library");
				}
				catch(InterruptedException e)
				{
					e.printStackTrace();
				}
		
		}
	}
}
