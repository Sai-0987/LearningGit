package CoreJavaPackage;

public class DeadLockDemo {
	public static void main(String[] args) {
		String s1 = "sai";
		String s2 = "Rohith";

		Thread t = new Thread() {
			@Override
			public void run() {
				synchronized (s2) {
					System.out.println("Resorce 2");
					try {
							t.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

				}
			}
		};
		Thread t1 = new Thread() {
			@Override
			public void run() {
				synchronized (s1) {
					System.out.println("Resorce 1");
					
				}
			}
		};
		t.start();
		t1.start();
	}

}
