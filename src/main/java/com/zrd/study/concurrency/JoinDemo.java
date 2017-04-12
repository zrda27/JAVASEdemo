package com.zrd.study.concurrency;

public class JoinDemo {
	public static void main(String[] args) throws InterruptedException {
		Thread thread1 = new Thread(new MyThread1());
		Thread thread2 = new Thread(new MyThread2());
		
		thread1.start();
		thread1.join();
		thread2.start();
		thread2.interrupt();
		System.out.println(thread2.isInterrupted());
		thread2.join();
		System.out.println("end");
	}
}

class MyThread1 implements Runnable{

	@Override
	public void run() {
		System.out.println("MyThread1");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("MyTHread1 end");
	}
	
}

class MyThread2 implements Runnable{

	@Override
	public void run() {
		System.out.println("MyThread2");
		try {
			Thread.sleep(2000);
			System.out.println("MyTHread2 end");
		} catch (InterruptedException e) {
			System.out.println("MyTHread2 interrupted");
		}
		System.out.println(Thread.interrupted());
	}
	
}
