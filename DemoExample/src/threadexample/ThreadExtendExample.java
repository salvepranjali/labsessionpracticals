package threadexample;

public class ThreadExtendExample {

	public static void main(String[] args) {
	 MyThread t=new MyThread();
      t.start(); // 2-thread created
      for(int i=1;i<=5;i++)
		{
			System.out.println("Main Thread");
		}

	}

}
 class MyThread extends Thread // creating thread using extend thread
 {
	 public void start() //normal method to start
	 {
		 super.start(); //create thread of parent class
		 System.out.println("I am start thread");
	 }
	 public void run() // overriding run()
	 {
		for(int i=1;i<=5;i++)
		{
			System.out.println("Child Thread");
		}
		
	 }
	 
 }
