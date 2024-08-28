package com.tnsif.day12.multiThread;

import com.tnsif.day11.Thread.MyChildThread;

public class ThreadlifecycleDemo {
	public static void main(String[] args) {
		MyChildThread obj =new MyChildThread();
		System.out.println("Before Runable stage Thread is");
		obj.start();
		try {
			Thread.sleep(4000);
		}
		catch(InterruptedException exp) {
			System.out.println("Thread  is Interrupted"+exp);
		}
		System.out.println("After complete exceution"+"of Thread.it is a live or not?"+obj.isAlive());
	}

}
