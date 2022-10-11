package com.svv.completabletask.async;


import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class FutureEx3 {

	public static void main(String[] args) throws InterruptedException, ExecutionException  {

		ExecutorService executerService = Executors.newFixedThreadPool(2);

		executerService.execute(new findSquare(4));

}
	
}

class findSquare implements Runnable {

	private int n;
	
	

	public findSquare(int n) {
		this.n = n;
	}

	public void calculate() {
	     System.out.println(n * n);
	}

	@Override
	public void run() {
		
		calculate();

	}

}
