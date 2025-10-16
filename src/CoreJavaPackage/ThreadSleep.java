package CoreJavaPackage;

public class ThreadSleep implements Runnable {

	@Override
	public void run() {
		System.out.println("Started...!!!!"+Thread.currentThread().getName()); /* new,Runnable,running,blocked,terminated 
		the threas was in new state remians untillits calls start methid
		*/
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Ended"+Thread.currentThread().getName());
	}

	public static void main(String[] args) {

		ThreadSleep t = new ThreadSleep();
		Thread p = new Thread(t);
		p.setName("Thread -1");
		p.setPriority(8);
		
		Thread p1=new Thread(t);
		p.setName("Thread -2");	
		p1.setPriority(10);
		p.start();
		p1.start();
	}

}
