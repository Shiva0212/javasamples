package util.Chapter2;

public class FirstThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Hello from main thread");
		Thread anotherThread = new AnotherThread();
		anotherThread.setName("==Another Thread==");
		anotherThread.start();
		
		new Thread() {
			public void run() {
				System.out.println("Hello from anonymous thread");
			};
		}.start();

		Thread myRunnableThread = new Thread(new MyRunnable());
		myRunnableThread.start();
		// or

		Thread myRunnableAnonymous = new Thread(new MyRunnable() {
			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("Hello from anonymous runnable class."+Thread.currentThread().getName());
			}
		});
		myRunnableAnonymous.start();

		System.out.println("Hello again from main thread");
	}

}
