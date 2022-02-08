import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int x = 1;
		do {
			
			System.out.println("Enter first number");
			int a = sc.nextInt();
			
			System.out.println("Enter second number");
			int b = sc.nextInt();
			
			System.out.println("Select the operation");
			System.out.println("1. Multiply");
			System.out.println("2. Addition");
			System.out.println("3. Divide");
			System.out.println("4. Subtract");
			
			int c = sc.nextInt();
			
			switch(c) {
			case 1:
				System.out.println(a*b);
				break;
			case 2:
				System.out.println(a+b);
				break;
			case 3:
				System.out.println(a/b);
				break;
			case 4:
				System.out.println(a-b);
				break;
			}
			System.out.println("Do you want to continue ? yes(1) / no(2)");
			x = sc.nextInt();
			
		}while(x==1);
			System.out.println("Program terminated");
		
	}

}
