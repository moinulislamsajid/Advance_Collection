package Thread;

public class Thread_implements extends Thread {

	
	public void run_game() {
		for(int i =0 ; i<5; i++){
			System.out.println("Allah Vorsha");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
