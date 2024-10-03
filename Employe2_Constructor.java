package constructors;
public class Employe2 {
	Employe2(){ //type1:default constructor
		System.out.println("default constructor");
	}
	Employe2(int emplyno,String empnm){//type2: parameter constructor
		System.out.println("employe num:"+emplyno);
		System.out.println("employe name : "+empnm);
	}
	public static void main(String[] args) {
		new Employe2();//type1----------it is called Implicitly
		new Employe2(101,"Deva");//type2
		///new Employe2();
	}
}
