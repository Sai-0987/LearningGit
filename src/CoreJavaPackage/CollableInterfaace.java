package CoreJavaPackage;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CollableInterfaace<V> implements Callable {

	@Override
	public Object call() throws Exception {
		System.out.println("Im from Callable inntereface..!!");
		return "Hi";
	}

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		CollableInterfaace c = new CollableInterfaace<>();

		ExecutorService newFixedThreadPool = Executors.newFixedThreadPool(10);
		for (int i = 1; i <= 15; i++) {
			Future submit = newFixedThreadPool.submit(c);
			System.out.println(submit.get().toString());
		}	 

		newFixedThreadPool.shutdown();
	}
}
