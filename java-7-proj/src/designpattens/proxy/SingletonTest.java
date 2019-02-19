package designpattens.proxy;

class Singleton {
	private static Singleton instance;
	
	private Singleton() {
		
	}
	
	public  static synchronized Singleton getSingleton() {
		if (instance == null) {
			synchronized (Singleton.class) {
				if (instance == null) {
					instance = new Singleton();
				}				
			}
		}
		return instance;
	}
}

public class SingletonTest {

	public static void main(String[] args) {
		System.out.println(Singleton.getSingleton().toString());
		System.out.println(Singleton.getSingleton().toString());
		Class c1 = null;
		try {
			c1 = Class.forName("designpattens.proxy.Singleton");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		Object o1 = null,o2 = null;
		try {
			o1 = c1.newInstance();
			o2 = c1.newInstance();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(o1.toString());
		System.out.println(o2.toString());
		

	}

}
