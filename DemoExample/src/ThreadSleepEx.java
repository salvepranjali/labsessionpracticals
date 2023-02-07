class UseThreadSleep extends Thread
{
 public void run()
 { 
	 try
   {
	 for(int i=0;i<5;i++)
	 {
		 System.out.println("I am Child Thread I am sleepy");
		 Thread.sleep(3000);
	 }
   }
	 catch( Exception e)
	 {
		System.out.println("This is Intrrupted Exception"); 
	 }
}
}
public class ThreadSleepEx
{

	public static void main(String[] args)
	{
		UseThreadSleep t=new UseThreadSleep();
		t.start();
		t.interrupt();
		for(int i=0;i<5;i++)
		{
			System.out.println("Main Thread");
		}

	}

}
