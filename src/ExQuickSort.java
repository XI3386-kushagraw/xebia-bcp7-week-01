import java.util.Scanner;

public class ExQuickSort {

	static int partition(int arr[], int s, int e) {
		// taking last element as pivot element
		int pivot = arr[e];
		int i = (s - 1);

		for (int j = s; j <= e - 1; j++) {
			// If current element is smaller than the pivot
			if (arr[j] < pivot) {
				i++; // increment index of smaller element
				int t = arr[i];
				arr[i] = arr[j];
				arr[j] = t;
			}
		}
		int t = arr[i + 1];
		arr[i + 1] = arr[e];
		arr[e] = t;
		return (i + 1);
	}

	static void quick(int arr[], int s, int e) {
		if (s < e) {
			int p = partition(arr, s, e);
			quick(arr, s, p - 1);
			quick(arr, p + 1, e);
		}
	}

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

		quick(arr, 0, n - 1);

		for (int i = 0; i < n; i++) {
			System.out.println(arr[i]);
		}

		sc.close();

	}

}
