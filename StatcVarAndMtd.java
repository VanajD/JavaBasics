package statics.pack;

public class StatcVarAndMtd {
	static int age=21;
	static String addr ="Nlr";
	String name="Deva";
	public void display() {
		System.out.println("lies in normal mtd");
		System.out.println("static var  age : "+(StatcVarAndMtd.age));	//we can access static variables by its classname.var..
		System.out.println("static var  addr : "+(StatcVarAndMtd.addr));
		System.out.println("normal var : "+name);
	}
	static void mtd() {				//static method
		System.out.println("it is a static method......");
	}
	public static void main(String[] args) {
		StatcVarAndMtd s =new StatcVarAndMtd();
		s.display();				//normal method accessed by object reference
		StatcVarAndMtd.mtd();		//we can access static methods by its classname.method name
	}

}
