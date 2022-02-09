abstract class Eat{
	abstract void Eating();
}
public class Exabstracion extends Eat{

	void Eating() {
		System.out.println("Eating Food");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Eat eat = new Exabstracion();
		eat.Eating();
	}

}
