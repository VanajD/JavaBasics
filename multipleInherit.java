package methods;
public class multipleInherit extends CallmethodwithParameters//,CallmtdwithoutParas
{//multiple inheritance is not supported by methods
		public static void main(String[] args) {
			multipleInherit mi=new multipleInherit();
			//mi.additon();  //it is in callwithoutparas class
			mi.display(); //it is in call with paras class
		}
		public void display(){
			System.out.println("It is a local method");
			}
}
