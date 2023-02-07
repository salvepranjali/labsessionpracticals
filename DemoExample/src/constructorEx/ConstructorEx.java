package constructorEx;

public class ConstructorEx {
	int roll_no;
	String name;

	public ConstructorEx() {
		
		this.roll_no=100;
		this.name="Pranjali";
	}
    ConstructorEx(int r,String n) {
		
		this.roll_no=r;
		this.name=n;
	
	}

	public static void main(String[] args) {
		ConstructorEx c=new ConstructorEx();
		ConstructorEx c1=new ConstructorEx(101,"Pritika");
		System.out.println(c1.roll_no);
		System.out.println(c1.name);
        System.out.println(c.roll_no);
		System.out.println(c.name);


	}

}
