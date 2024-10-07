package constructors;
//diff b/w constructor and method
public class Employe3 {
	int empno1;//Initially value=0
	String empnm1;//Initially value=null
	Employe3(int empno,String empnm){			//----------values passed through parameters (2)
		System.out.println("inside constructor");
		System.out.println("employee name: "+empnm);
		System.out.println("employee num: "+empno);
	}
	public Employe3() {				//all staments execute when object created(1)
		System.out.println("default constructor");
	}
	public void display() {			//accessed by  creating object **reference
		System.out.println("employee name: "+empnm1);
		System.out.println("employee num: "+empno1);
	}
	public static void main(String[] args) {
		new Employe3(101,"Deva");		//giving it to constructor--(2)
		Employe3 em=new Employe3();     //em is the object reference  and (1) too
		em.display();
	}
}
