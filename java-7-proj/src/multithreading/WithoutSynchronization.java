package multithreading;


class PrintMsg {
	//private String msg;
	
	public synchronized void print(String msg) throws InterruptedException {
		System.out.print("[");
		System.out.print(msg);
		Thread.sleep(1000);
		System.out.print("]");
	}
}

class PrintThread implements Runnable {
	Thread t;
	PrintMsg p;
	String msg;
	PrintThread(PrintMsg p, String msg) {
		this.p = p;
		this.msg = msg;
		t = new Thread(this);
		t.start();
	}
	@Override
	public void run() {
		//synchronized(p) {
			try {
				p.print(msg);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		//}
		
	}
}

public class WithoutSynchronization {

	public static void main(String[] args) {
		/*PrintMsg pm = new PrintMsg();
		PrintMsg pm2 = new PrintMsg();
		PrintMsg pm3 = new PrintMsg();
		PrintThread t1 = new PrintThread(pm, "1");
		PrintThread t2 = new PrintThread(pm2, "2");
		PrintThread t3 = new PrintThread(pm3, "3");*/ // Does not work if same instance is not passed
		
		PrintMsg pm = new PrintMsg();
		PrintThread t1 = new PrintThread(pm, "1");
		PrintThread t2 = new PrintThread(pm, "2");
		PrintThread t3 = new PrintThread(pm, "3");

	}

}
