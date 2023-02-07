package threadexample;

public class ExceptionEx {

	public static void main(String[] args) {
		ExceptionEx e1=new ExceptionEx();
		e1.m3();
}
	 void m1() throws ArithmeticException
	 {
		 try {
			 int j=(30/0);
			 System.out.println(j);
		 }
		catch(Exception e)
			 {
			System.out.println(e);
			 } 
	     
	 }
	 void m2()
	 {
		m1(); 
	 }
	 void m3()
	 {
	    m2();
	 }
	 

}
                      