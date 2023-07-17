package Thread;

public class Implements_thread implements Runnable {

	@Override
	public void run() {
		for(int u =0 ; u<5; u++) {
			System.out.println("AlhamDUllah");
			try {
				Thread.sleep(1000);
			}catch(Exception e) {
				System.out.println(e);
			}
		}
	}
}
