package constructorEx;

public class VehicleEx {
	int v_no;
	String v_name;
    public VehicleEx() {
		this.v_name="Maruti";
		this.v_no=101;
	}

	public static void main(String[] args) {
		VehicleEx v=new VehicleEx();
		System.out.println(v.v_name);
		System.out.println(v.v_no);

		

	}

}
