package polymorphism;
public class Ovrload {
	public static void main(String[] args) {
		Ovrload ov = new Ovrload();
		ov.Userlogin();
		ov.Userlogin(789, "abc");
		ov.Userlogin("DEvan", "abc");
		ov.Userlogin("Devan", "abc", "ooo");
	}
	public void Userlogin(String usernm,String pwd) {
		System.out.println("user name: "+usernm);
		System.out.println("password :"+pwd);
	}
	public void Userlogin(String usernm,String pwd,String captcha) {
		System.out.println("username : "+usernm);
		System.out.println("password : "+pwd);
		System.out.println("captcha : "+captcha);
	}
	public void Userlogin(int mobile,String pwd) {
		System.out.println("mobile num : "+ mobile);
		System.out.println("password : "+pwd);
	}
	public void Userlogin() {
		System.out.println("no parameters");
		System.out.println("........");
	}
}
