package Thread;

public class Thread_Scheduler extends Thread{
	
		public void run() {
			String n = Thread.currentThread().getName();
			for(int i =0; i<3; i++) {
				System.out.println(n);
				/*try {
				Thread.sleep(1000);
				}catch(Exception e) {
					System.out.println(e);*/
			}
		}
}





