package multithreading;

import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;

class Resource {
	int randomInt;
	public void generateRandom() {
		Random r = new Random();
		randomInt = r.nextInt();
		System.out.println("Generated Random = " + randomInt);
	}
	
	public int getRandom() {
		return randomInt;
	}
}

class Pro implements Callable {
	Resource r;
	public Pro(Resource r) {
		this.r = r;
	}
	@Override
	public Object call() throws Exception {
		r.generateRandom();
		return "ok";
	}
}

class Con implements Callable {
	Resource r;
	public Con(Resource r) {
		this.r = r;
	}
	@Override
	public Object call() throws Exception {
		return r.getRandom();
	}
}

public class RandomPrint {

	public static void main(String[] args) {
		Resource r = new Resource();
		ExecutorService es = Executors.newFixedThreadPool(1);
		Future f1 = es.submit(new Pro(r));
		/*es.shutdown();
		try {
			es.awaitTermination(5, TimeUnit.SECONDS);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}*/
		//if (f1.isDone()) {
			//es = Executors.newFixedThreadPool(1);
			Future f2 = es.submit(new Con(r));
			/*es.shutdown();
			try {
				es.awaitTermination(5, TimeUnit.SECONDS);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}*/
			//if (f2.isDone()) {
				try {
					int i = (int)f2.get();
					System.out.println(i);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (ExecutionException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			//}
		//}
				
				FutureTask fff;

	}

}
