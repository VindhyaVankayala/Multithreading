import java.util.Scanner;

public class ThreadRunnableMultImpl implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		String threadName = Thread.currentThread().getName();
		
		if(threadName.equals("COURSE_REG"))
		{
			registerCourse();
		}
		else if(threadName.equals("Enquiry"))
		{
			courseInfo();
		}
		else
		{
			welcome();
		}
	}
	
	public void welcome()
	{
		System.out.println("Welcome to the course portal - Multithreading 4");
	}
	
	public void courseInfo()
	{
		System.out.println("Welcome to Telusko courses");
		System.out.println("We have two courses live - Agentic AI course and Generative AI course");
	}
	
	public void registerCourse()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name: ");
		String name = sc.next();
		System.out.println("Enter your age: ");
		Integer age = sc.nextInt();
		System.out.println("Enter the course: ");
		String course = sc.next();
		System.out.println(name + " is enrolled to the " + course);
	}
	
	
	

}
