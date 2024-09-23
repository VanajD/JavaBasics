package polymorphism;
public class Overide extends Ovrload{

		public static void main(String[] args) {
			Overide ov =new Overide();
			ov.Userlogin();//it is not there in this class so it checks in the extended class
		}
		public void Userlogin1() {
			System.out.println("sub class");
		}
}
