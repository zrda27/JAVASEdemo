package com.zrd.study.concurrency;

public class SyncDemo {
	public synchronized void aa(SyncDemo o) throws InterruptedException{
		System.out.println("aa");
		Thread.sleep(2000);
		o.bb(this);
	}
	public synchronized void bb(SyncDemo o) throws InterruptedException{
		System.out.println("bb");
		Thread.sleep(2000);
		o.aa(this);
	}
	
	public static void main(String[] args) {
		SyncDemo demo1 = new SyncDemo();
		SyncDemo demo2 = new SyncDemo();
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				try {
					demo1.aa(demo2);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		}).start();
		
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				try {
					demo2.bb(demo1);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		}).start();
	}
}
