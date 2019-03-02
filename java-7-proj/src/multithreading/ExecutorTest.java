package multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

class Q3 {
	int i;
	boolean flag = false;
	
	public synchronized void put(int i) {
		while (flag) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		this.i = i;
		flag = true;
		notify();
		System.out.println("Put " + i);
	}
	public synchronized int get() {
		while (!flag) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Get " + i);
		flag = false;
		notify();
		return i;
	}
}

class Producer3 implements Runnable {
	Q3 q;
	int i=1;
	public Producer3(Q3 q) {
		this.q = q;
		new Thread(this, "Producer3").start();
	}
	@Override
	public void run() {
		while(i <= 100) {
			q.put(i++);
		}
	}
}

class Consumer3  implements Runnable {
	Q3 q;
	public Consumer3(Q3 q) {
		this.q = q;
		new Thread(this, "Consumer3").start();
	}
	
	@Override 
	public void run() {
		while(true) {
			try {
				Thread.sleep(20);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			q.get();
		}
	}
}

public class ExecutorTest {

	public static void main(String[] args) {
		Q3 q = new Q3();
		
		ExecutorService es = Executors.newFixedThreadPool(1);
		/*Future f1 = es.submit(new Producer3(q));
		Future f2 = es.submit(new Consumer3(q));
		*/
		es.execute(new Producer3(q));
		es.execute(new Consumer3(q));
		
		
		//while (f1 != null && f2 != null);
		
		es.shutdown();
		
        try {
			es.awaitTermination(10, TimeUnit.SECONDS);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
        
        
       /* while (!es.isTerminated()) {
https://stackoverflow.com/questions/18425026/shutdown-and-awaittermination-which-first-call-have-any-difference
        }*/
		System.out.println("End");
	}

}
