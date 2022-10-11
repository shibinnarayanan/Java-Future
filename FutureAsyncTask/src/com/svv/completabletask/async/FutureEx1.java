package com.svv.completabletask.async;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

//executorservice with .submit function example

public class FutureEx1 {

	public static void main(String[] args) throws InterruptedException, ExecutionException {

		ExecutorService executerServ = Executors.newFixedThreadPool(10);

		Future<List<Integer>> future = executerServ.submit(() -> {
			
			System.out.println("Task Submited");
			Thread.sleep(5000);
			return Arrays.asList(1, 2, 3, 4);
		});
		
		List<Integer> futureResult = future.get();
		
		System.out.println(futureResult);// result will print after 5 sec delay
	}

}
