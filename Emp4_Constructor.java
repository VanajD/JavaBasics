package constructors;
public class Emp4 {
	int eno1;
	String enm1;
	Emp4(int eno1,String enm1){  //passed through paras
		this.enm1 = enm1;		//local values are assigned to instance variables
		this.eno1 = eno1;		//local values are assigned to instance variables
		System.out.println("employeeeee name :"+enm1);
		System.out.println("employeeeeeee no :"+eno1);
	}
	public void display() {
		System.out.println("display method     "+enm1+"	"+eno1);
	}
	public static void main(String[] args) {
		Emp4 e =new Emp4(21, "Deva");		
		e.display();		//Explicitly calling
	}
}
