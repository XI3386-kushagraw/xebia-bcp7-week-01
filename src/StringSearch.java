import java.util.Scanner;

public class StringSearch {

	int binarySearch(String arr[], String x) {
		int l = 0, r = arr.length - 1;
		while (l <= r) {
			int m = l + (r - l) / 2;

			// Check if x is present at mid
			if (arr[m].equals(x))
				return m;

			// If x greater, ignore left half
			if (arr[m].charAt(0) < x.charAt(0))
				l = m + 1;

			// If x is smaller, ignore right half
			else
				r = m - 1;
		}

		// if we reach here, then element was
		// not present
		return -1;
	}

	public static void main(String args[]) {
		// Initializing scanner class object
		Scanner sc = new Scanner(System.in);

		// Taking the size of the array
		System.out.println("Enter the number of elements you want");
		int n = sc.nextInt();

		// Declaring array and taking user inputs
		String arr[] = new String[n];

		for (int i = 0; i < n; i++) {
			arr[i] = sc.next();
		}

		for (int i = 0; i < n - 1; i++) {
			for (int j = i + 1; j < n; j++) {
				if (arr[i].charAt(0) > arr[j].charAt(0)) {
					String temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}

		// Printing the sorted array
		System.out.println("");
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}

		System.out.println("\nEnter string that has to be searched");
		String s = sc.next();

		StringSearch ss = new StringSearch();

		int result = ss.binarySearch(arr, s);
		if (result == -1)
			System.out.println("Element not present");
		else
			System.out.println("Element found at " + "index " + result);
	}
}