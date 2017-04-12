package com.zrd.study.concurrency;

import java.util.Date;

public class Tread {
	public static void main(String[] args) throws InterruptedException {
		String[] importantInfo = new String[]{"a", "b", "c", "d", "e"};
		for (int i = 0; i < importantInfo.length; i++) {
		    // Pause for 4 seconds
		    try {
		        Thread.sleep(4000);
		    } catch (InterruptedException e) {
		        // We've been interrupted: no more messages.
		        return;
		    }
		    // Print a message
		    System.out.println(Thread.interrupted() + importantInfo[i]);
		}
	}
}
