public class Main {
	
	public static void main(String[] args) {
		
		System.out.println("\u001B[31m"+"Main Thread");
		
		/***************************************************
		 * Thread Class example                            *
		 ***************************************************/
		/*
		Thread t1 = new ThreadExample();
		t1.start();
		*/
		
		/***************************************************
		 * Thread Class - Anonymous class example          *
		 ***************************************************/
		/*
		new Thread(){
			@Override
			public void run(){
				System.out.println("\u001B[33m"+"Thread Class - Anonymous class");
			}
		}.start();
		*/
		
		/*****************************************************************
		 * Thread Class - Anonymous class with lambda expression example *
		 *****************************************************************/
		/*
		new Thread(
				() -> System.out.println("\u001B[33m"+"Thread Class - Anonymous class with labmda")
		).start();
		*/
		
		/*****************************************************************
		 * Runnable Interface example                                    *
		 *****************************************************************/
		/*
		Thread t2 = new Thread(new RunnableExample());
		t2.start();
		*/
		
		/****************************************************************
		 * Runnable Interface - Anonymous class example                 *
		 ****************************************************************/
		/*
		new Thread(new RunnableExample()){
			@Override
			public void run(){
				System.out.println("\u001B[34m"+"Runnable Interface - Anonymous class");
				try {
					t1.join();
					System.out.println("\u001B[34m"+"Runnable Interface - Continue after Thread Class");
				}
				catch (InterruptedException e){
					System.out.println("Runnable Interface Interrupted");
				}
			}
		};
		t2.start();;
		*/
		
		/****************************************************************
		 * interrupt() example                                          *
		 ****************************************************************/
		/*
		Thread t1 = new Thread() {
			@Override
			public void run() {
				System.out.println("\u001B[33m" + "Thread 1");
				
				try {
					sleep(3000);
					System.out.println("\u001B[33m" + "Thread 1 after 3sn");
				} catch (InterruptedException e) {
					System.out.println("\u001B[33m" + "Thread 1 - Interrupted");
				}
			}
		};
		t1.start();
		
		Thread t2 = new Thread(new RunnableExample()){
			@Override
			public void run(){
				System.out.println("\u001B[34m"+"Thread 2");
				t1.interrupt();
			}
		};
		t2.start();
		*/
		
		/****************************************************************
		 * join() example                                               *
		 *****************************************************************/
		/*
		Thread t1 = new Thread() {
			@Override
			public void run() {
				System.out.println("\u001B[33m" + "Thread 1");
				
				try {
					sleep(3000);
					System.out.println("\u001B[33m" + "Thread 1 after 3sn");
				} catch (InterruptedException e) {
					System.out.println("\u001B[33m" + "Thread 1 - Interrupted");
				}
			}
		};
		t1.start();
		
		Thread t2 = new Thread(new RunnableExample()){
			@Override
			public void run(){
				System.out.println("\u001B[34m" + "Thread 2");
				
				try {
					t1.join();
					System.out.println("\u001B[34m" + "Thread 2 - Continue after Thread 1");
				} catch (InterruptedException e) {
					System.out.println("\u001B[34m" + "Thread 2 - Interrupted");
				}
			}
		};
		t2.start();
		*/
	}
}