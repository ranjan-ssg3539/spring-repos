package multithreading;

class Singleton {
	private Singleton instance;
	public Singleton getinstance() {
		if (instance == null) {
			instance = new Singleton();
		}
		return instance;
	}
}

class T implements Runnable {
	Thread t;
	public void T() {
		t = new Thread(this, "RK Thread");
	}
	@Override
	public void run() {
		
	}
}

public class SingletonTest {

	public static void main(String[] args) {
		ArrayList a;
		Linkedist l;
	}

}
