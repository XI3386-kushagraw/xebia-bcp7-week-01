import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Initializing scanner class object
		Scanner sc = new Scanner(System.in);

		// Taking the size of the array
		int n = sc.nextInt();

		// Declaring array and taking user inputs
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		// Performing Bubble sort
		for (int i = 0; i < n; i++) {
			for (int j = 1; j < n - i; j++) {
				if (arr[j - 1] > arr[j]) {
					int temp = arr[j];
					arr[j] = arr[j - 1];
					arr[j - 1] = temp;
				}
			}
		}

		// Printing the sorted array
		for (int i = 0; i < n; i++) {
			System.out.println(arr[i]);
		}

		sc.close();
	}

}
