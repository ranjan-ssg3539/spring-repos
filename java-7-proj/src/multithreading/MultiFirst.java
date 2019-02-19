package multithreading;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

class RKRunnable implements Runnable {
	Thread t;
	
	RKRunnable(String name, int priority) {
		t = new Thread(this, name);
		t.setPriority(priority);
		t.start();
	}
	
	@Override
	public void run() {
		for (int i=1; i<= 100; i++) {
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() + " = " + i);
		}
	}
}

public class MultiFirst {

	public static void main(String[] args) {
		Map<String, String> hm = new ConcurrentHashMap<String, String>();
		RKRunnable t1 = new RKRunnable("t1",1);
		RKRunnable t2 = new RKRunnable("t2",10);
		
		try {
			t1.t.join();
			t2.t.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Main says bye bye"); // <- check with and without join
		

	}

}
