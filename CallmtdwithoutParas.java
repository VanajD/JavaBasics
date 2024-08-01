package methods;
public class CallmtdwithoutParas {
	int a=10;
	int b=20;
	int c;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CallmtdwithoutParas ca = new CallmtdwithoutParas();
		ca.addition();
		ca.subtraction();
	}
	public void addition() {
		c=a+b;
		System.out.println("adiition: "+c);
	}
	public void subtraction() {
		c=b-a;
		System.out.println("subtraction : "+c);
	}
}
