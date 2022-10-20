

public class Coach extends Mobile {
	@Override
	public void Csk() {
		super.Csk();
		System.out.println("CSk Coach");
		System.out.println("Steven fleming");
		System.out.println("");
	}
@Override
public void Mi() {
	super.Mi();
	System.out.println("Mi Coach");
    System.out.println("Mahela Jayawardene");
}
public static void main(String []args) {
	Coach obj=new Coach();
	obj.Csk();
	obj.Mi();
}
}



