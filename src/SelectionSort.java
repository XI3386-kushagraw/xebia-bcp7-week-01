import java.util.Scanner;

public class SelectionSort {

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

		// Performing Selection sort
		for (int i = 0; i < n - 1; i++) {
			for (int j = i + 1; j < n; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
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
