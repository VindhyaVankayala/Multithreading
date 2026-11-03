
public class EnrollCourse implements Runnable{
	
	public void completeRegistration()
	{
		System.out.println("Registered course Successfully");
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		completeRegistration();
		
	}

}
