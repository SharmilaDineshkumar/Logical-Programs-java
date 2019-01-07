package test.thread;

public class SleepThread extends Thread{

 public void run(){  
	  for(int i=1;i<5;i++){  
	    try{
	    	Thread.sleep(500);
	    	System.out.println("comming inside : "+this);
	    }
	    catch(InterruptedException e){
	    	System.out.println("msg : "+e.getMessage());
	    	}  
	    System.out.println(i+" "+this);  
	  }  
	  System.out.println("outside : "+this.getName()+"  "+this);
	 }  
	 public static void main(String args[]){  
		 SleepThread t1=new SleepThread();  
		 SleepThread t2=new SleepThread();  
	   
	  t1.start();  
	  t2.start();  
	 }  
	}