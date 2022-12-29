/* WAP take a input of age from the user if the age is above 18 print 'You are eligible to vote'
else throw an Exception That 'Age is not Correct'
*/
package Assignment29Dec2022;

import java.util.Scanner;

public class Program1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Age Of user");
		int age=sc.nextInt();
		 if(age>=18)
		 {
			 System.out.println("You are Eligible to vote");
		 }
		 else
		 {
			 throw new ArithmeticException("Age is Not correct");
		 }
		

	}

}
