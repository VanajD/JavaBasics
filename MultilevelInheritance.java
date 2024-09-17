package methods;
class Other{
	public void show() {
		System.out.println("It is a show method inside Other class:");
	}
}
class Mydata extends Other{
	public void display() {
		System.out.println("It is a display method inside Mydata class:");
	}
}

public class MultilevelInheritance extends Mydata {

	public void window() {
		System.out.println("It is a local method:");
	}
	public static void main(String[] args) {
		MultilevelInheritance mi = new MultilevelInheritance();
		mi.show();
		mi.display();
		mi.window();
	}

}
