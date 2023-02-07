class UseThread extends Thread
{
  public void run()
  {
	  for(int i=0;i<=5;i++)
	  {
		  System.out.println("Child Thread");
	  }
	  
  }
}
public class ThreadPriority {

	public static void main(String[] args) {
		UseThread t=new UseThread();
		System.out.println("Main Thread Priority:"+Thread.currentThread().getPriority());
		t.setPriority(8);
		System.out.println("Child Thread Priority:"+t.getPriority());
		t.start();

		 for(int i=0;i<=5;i++)
		 {
			 System.out.println("Main Thread");
		 }

	}

}
