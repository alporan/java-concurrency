public class Main {
	
	public static void main(String[] args) {
		
		System.out.println("from Main");
		
		// Thread class
		Thread t1 = new ThreadExample();
		t1.start();
		
		// Anonymous Thread class
		new Thread(){
			@Override
			public void run(){
				System.out.println("from AnonymousThread");
			}
		}.start();
		
		// Anonymous Thread class with lambda expression
		new Thread(
				() -> System.out.println("from AnonymousThread2")
		).start();
		

	}
}