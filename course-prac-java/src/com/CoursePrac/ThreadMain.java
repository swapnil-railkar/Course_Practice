package com.CoursePrac;
public class ThreadMain {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Counter counter = new Counter();
		Runnable ta = ()->{
			for(int i=0; i< 1000; i++) {
	    		counter.increment();
			}
		};
		Runnable tb = ()->{
			for(int i=0; i< 1000; i++) {
	    	    counter.increment();
			}
		};
		
        Thread a = new Thread(ta);
        Thread b = new Thread(tb);
   
        
        a.start();
        b.start();
        
        a.join();
        b.join();
        System.out.println(counter.getCount());
	}

}
