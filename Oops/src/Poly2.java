class Hello{
	public Hello() {
		System.out.println("Default constructor is created");
	}
	public Hello(int i) {
		System.out.println("This is an integer input "+i);
	}
	public Hello(String s) {
		System.out.println("This is a string input "+s);
	}
}

public class Poly2 extends Hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Hello hello = new Hello();
		Hello hello1 = new Hello(1);
		Hello hello2 = new Hello("Kushagra Wadhwa");

	}

}
