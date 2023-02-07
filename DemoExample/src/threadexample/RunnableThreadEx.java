package threadexample;

public class RunnableThreadEx {

	public static void main(String[] args) {
		MyRunnable m=new MyRunnable();
		Thread t=new Thread(m);
		t.run();
		MyRunnable.start();
		
		   }


}
class MyRunnable implements Runnable
{
	static public void start()
	{
		System.out.println("this is Main class Start method");
	}
 public void run()
 {
	 for(int i=1;i<=4;i++)
	 {
		 System.out.println("This is child Thread");
	 }
 }
}

