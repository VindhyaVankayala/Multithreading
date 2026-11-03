
public class Thread2 {
	
	public static void main(String[] args) {
		
		Alpha a = new Alpha();
		Beta b = new Beta();
		Gaama g = new Gaama();
		
		a.start();
		b.start();
		g.start();
		
		System.out.println("All threads started");
		
		System.out.println("All threads ended");
	}

}
