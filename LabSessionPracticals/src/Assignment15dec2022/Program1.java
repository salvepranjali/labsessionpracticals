
//Program No 1: Create class Employee with Employee id,name,salary,designation,company Name.
	
package Assignment15dec2022;

public class Program1 {
		   int e_Id;
		   String e_Name;
		   int salary;
		   String e_Designation;
		   static int count=0;
		   static String companyName=" Anudip Foundation";
		   Program1()
		       {
		         System.out.println("This is Employee Information"); 
		         count++;
		       }
		   Program1(int id,String name,String designation,int s)
		       {
		         this.e_Id=id;
		         this.e_Name=name;
		         this.e_Designation=designation;
		         this.salary=s;
		         count++;
		       }

		       public String toString()
		       {
		         return e_Id+" "+e_Name+" "+" "+e_Designation+" "+companyName+" "+salary;
		       }

		         public static void main(String args[])
		          {
		        	 Program1 ed=new Program1();
		        	 Program1 e=new Program1(101,"Pranjali","CEO",35000);
		        	 Program1 e1=new Program1(102,"Pritika","Administrator",25000);
		        	 Program1 e2=new Program1(103,"Jayshri","CM",30000);
		        	 Program1 e3=new Program1(104,"Nikita","Sales Department Head",20000);
		            System.out.println(e);
		            System.out.println(e1);
		            System.out.println(e2);
		            System.out.println(e3);
		            System.out.println("Number of Objects: "+Program1.count);

		}
		}

	