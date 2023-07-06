package com.jspiders.multithreading.main;
import com.jspiders.multithreading.threads.MyThread1;
import com.jspiders.multithreading.threads.MyThread2;

public class ThreadMain {
	public static void main(String[] args) {
		MyThread1 mythread1= new MyThread1();
		mythread1.setName("Thread-1");
		mythread1.setPriority(9);
		
		MyThread2 mythread2= new MyThread2();
		Thread thread= new Thread(mythread2);
		thread.setName("Thread-2");
	    thread.setPriority(10);
	    
	    mythread1.start();
	    thread.start();
	}

}