import java.util.Scanner;
import java.util.Stack;

public class ExStack1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Creating object of Scanner class
		Scanner sc=new Scanner(System.in);
		
		//Creating Stack Object to perform operations
		Stack<Integer> st=new Stack<>();
		
		//Enter the number of elements
		System.out.println("Enter the number of elements you want to enter in stack");
		int n = sc.nextInt();
		
		for(int i=0;i<n;i++) {
			
			System.out.println("Enter the element you want to push in stack");
			//Enter the element you want to push in stack
			int x = sc.nextInt();
			//Element is pushed in stack
			st.push(x);
			System.out.println("Stack is: "+st);
		}
		
		sc.close();
	}

}
