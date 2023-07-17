package Thread;

public class Implements_main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		Implements_thread th = new Implements_thread();
	
		// when you declaring or initialization the thread in implements thread
		
		// can not run the implements i mean the started function this is the function
		
		// You need to create objects in Thread class
		
		// create a thread class to called the started function
		
		Thread t = new Thread(th);
		t.start();
		
		for(int v=0; v<5; v++) {
			System.out.println();
			Thread.sleep(1000);
		}
		
	
		

	}

}
