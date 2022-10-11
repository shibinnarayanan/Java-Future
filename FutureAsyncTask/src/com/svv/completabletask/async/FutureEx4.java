package com.svv.completabletask.async;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class FutureEx4 {

	public static void main(String[] args) throws InterruptedException, ExecutionException {

		ExecutorService executerService = Executors.newFixedThreadPool(2);

		Future<String> futureResult = executerService.submit(

				() -> {
					System.out.println("Task submitted..........");
					Thread.sleep(5000);
					return "Hi Shibin";
				}

		);

		String resutlGet = futureResult.get();

		System.out.println(resutlGet); // result will print after 5 sec
	}

}
