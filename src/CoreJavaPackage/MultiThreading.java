package CoreJavaPackage;

public class MultiThreading extends Thread {// Basincally we can able to create thread in twio ways 1. Extending the
											// Threaad class and Implementing the Runnble interface
	public void run() {
		System.out.println("Run Method");
		m1();
		System.out.println("Run Method ended..!!!");
	}

	public void m1() {
		System.out.println("UserDefined Thread Started");
	}

	public static void main(String[] args) {
		System.out.println("Main Thread Started..!!");
		MultiThreading m = new MultiThreading();

		Thread t = new Thread(m);// for use defined thread are we should Extend the Thread class

		t.start();// When we use start method this method is searching for run method so we should
					// create run method
		System.out.println("Main thread was Ended..!!!");

	}

}
