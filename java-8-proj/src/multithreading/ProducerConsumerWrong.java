package multithreading;

class Q {
	int n;
	synchronized void put(int n) {
		this.n= n;
		System.out.println("Put = " + n);
	}
	synchronized int got() {
		System.out.println("Got = " + n);
		return n;
	}
}

class Producer implements Runnable {
	Q q;
	public Producer(Q q) {
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

class Consumer implements Runnable {
	Q q;
	public Consumer(Q q) {
		this.q = q;
		new Thread(this, "Consumer").start();
	} 
	@Override
	public void run() {
		int i=0;
		while (true) {
			q.got();
			i++;
		}
	}
	
}

public class ProducerConsumerWrong {

	public static void main(String[] args) {
		Q q = new Q();
		new Producer(q);
		new Consumer(q);

	}

}
