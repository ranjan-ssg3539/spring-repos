package designpattens.proxy;

interface Batch {
	void registerStudent(String studentName);
}

class CourseBatch implements Batch {
	@Override
	public void registerStudent(String studentName) {
		System.out.println("Student name = " + studentName);
		
	}
}

class ProxyBatch implements Batch {
	Batch batch;
	ProxyBatch(Batch batch) {
		this.batch = batch;
	}
	@Override 
	public void registerStudent(String studentName) { // try without public
		batch.registerStudent(studentName);
	}
}

public class ProxyDP {

	public static void main(String[] args) {
		Batch courseBatch = new CourseBatch();
		Batch proxyBatch = new ProxyBatch(courseBatch);
		proxyBatch.registerStudent("Amit");
		proxyBatch.registerStudent("Bidhan");
	}

}
