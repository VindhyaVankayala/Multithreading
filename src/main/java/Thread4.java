
public class Thread4 {
	
	public static void main(String[] args) {
		
		ThreadRunnableMultImpl tMulti = new ThreadRunnableMultImpl();
		
		Thread t1 = new Thread(tMulti);
		Thread t2 = new Thread(tMulti);
		Thread t3 = new Thread(tMulti);
		
		t1.setName("COURSE_REG");
		t2.setName("Enquiry");
		t3.setName("Welcome");
		
		t1.start();
		t2.start();
		t3.start();
		
	}

}
