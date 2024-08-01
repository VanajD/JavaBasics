package methods;
public class CallmethodwithParameters {
	/*String name="Devan";
	int age=20;
	String  addr ="Nellore"; */
	public static void main(String[] args) {
		CallmethodwithParameters p =new CallmethodwithParameters();
		p.display("Nellore",20,"Devan");

	}
	public void display(String  addr,int age,String name) {
		System.out.println("name : "+name);
		System.out.println("age :"+age);
		System.out.println("addr : "+addr);
	}


}
