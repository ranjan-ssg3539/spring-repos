package multithreading;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

class Q4 {
	int i;
	int max = 500;
	boolean flag = false;
	public synchronized int get() {
		while (!flag) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		flag = false;
		notify();
		System.out.println("Get " + i);
		return i;
	}
	public synchronized void put(int i) {
		while (flag) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Put " + i);
		this.i = i;
		flag = true;
		notify();
	}
}

class Producer4 implements Callable {
	Q4 q;
	public Producer4(Q4 q) {
		this.q = q;
		//new Thread(this).start();
	}
	
	/*@Override
	public void run() {
		int i = 1;
		while (i<500) {
		//while (true) {
			try {
				Thread.sleep(5);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			q.put(++i);
		}			
	}*/

	@Override
	public Object call() throws Exception {
		int i = 1;
		while (i<q.max) {
			q.put(++i);
		}
		return "ok";
	}
}

class Consumer4 implements  Runnable {
	Q4 q;
	public Consumer4(Q4 q) {
		this.q = q;			
		new Thread(this).start();
	}
	
	@Override
	public void run() {
		while (q.get() < q.max);
		//while (true) {
			//q.get();
		//}
	}
}

public class CallableTest {
		

	public static void main(String[] args) {
		Q4 q = new Q4();
		q.max = 500000;
		//Executor exe = Executors.newFixedThreadPool(1);
		ExecutorService exe = Executors.newSingleThreadExecutor();
		Future f1 = exe.submit(new Producer4(q));
		Future f2 = exe.submit(new Consumer4(q));
		exe.shutdown();
		try {
			exe.awaitTermination(10, TimeUnit.SECONDS);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Bye");
		//while (!f1.isDone() && !f2.isDone());
		//Callable c;
		
	}

}
