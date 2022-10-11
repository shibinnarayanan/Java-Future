package com.svv.completabletask.async;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

//executorservice with .execute function example

public class FutureEx2 {
	
	public static void main(String[] args) {
		
		ExecutorService executerService = Executors.newFixedThreadPool(2);
//		executerService.submit(new MyTask());
//		executerService.submit(new MyTask());
//		executerService.submit(new MyTask());
		executerService.execute(new MyTask()); // no return
		executerService.execute(new MyTask());
		executerService.execute(new MyTask());
	}

}

class MyTask implements Runnable
{

	@Override
	public void run() {
		
		for(int i=0;i<5;i++)
		{
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName()+", Value -> "+i);
		}
	}


}
