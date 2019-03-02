package multithreading;

class Q1 {
	int n;
	boolean flag = false;
	synchronized void put(int n) {
		while (flag) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}		
		this.n= n;
		System.out.println("Put = " + n);
		flag = true;
		notify();
	}
	synchronized int got() {
		while (!flag) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		flag = false;
		System.out.println("Got = " + n);
		notify();
		return n;
	}
}

class Producer1 implements Runnable {
	Q1 q;
	public Producer1(Q1 q) {
		this.q = q;
		new Thread(this,"Producer").start();
	}
	
	@Override
	public void run() {
		int i=0;
		while(true) {
			q.put(i++);
		}
	}
}

class Consumer1 implements Runnable {
	Q1 q;
	public Consumer1(Q1 q) {
		this.q = q;
		new Thread(this, "Consumer").start();
	} 
	@Override
	public void run() {
		while (true) {
			q.got();	
		}
	}
	
}

public class ProducerConsumerCorrect {

	public static void main(String[] args) {
		Q1 q = new Q1();
		new Producer1(q);
		new Consumer1(q);

	}

}
