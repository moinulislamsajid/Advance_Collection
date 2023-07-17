package Thread;

public class Thread_Schedur_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// crtate an onjects
		
	Thread_Scheduler T1 = new Thread_Scheduler();
	Thread_Scheduler T2 = new Thread_Scheduler();
	Thread_Scheduler T3 = new Thread_Scheduler();
	
	
	T1.setName("Ayman Sajid");
	T2.setName("Samiur Rahman Sakib");
	T3.setName("Mojibur Rahman");
	
	
	T1.start();
	T2.start();
	T3.start();

		
	}

}
