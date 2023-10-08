package com.CoursePrac;

public class TA implements Runnable{
    @Override
    public void run() {
    	for(int i=0; i< 10; i++) {
    		System.out.println("hi");
    		try {
				Thread.sleep(12);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    	}
    }
}
