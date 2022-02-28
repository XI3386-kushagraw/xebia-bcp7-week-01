class Heat {
	void Eating() {
		System.out.println("Hello This is EatClass");
	}
}

public class Poly1 extends Heat {

	void Eating() {
		System.out.println("Hello This is Poly1 Class");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// This will call the parent class function
		Heat eat = new Heat();
		eat.Eating();

		// This will call the class function itself
		Heat ear = new Poly1();
		ear.Eating();
	}

}
