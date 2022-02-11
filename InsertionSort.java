import java.util.Scanner;

public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Initializing scanner class object
		Scanner sc=new Scanner(System.in);
						
		//Taking the size of the array
		int n = sc.nextInt();
					
		//Declaring array and taking user inputs
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		
		//Performing Insertion sort
		for(int i=1;i<n;i++) {
			int temp=arr[i];
			int j=i-1;
			while(j>=0 && arr[j]>temp) {
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=temp;
		}
		
		//Printing the sorted array
		for(int i=0;i<n;i++) {
			System.out.println(arr[i]);
		}
						
		sc.close();
	}

}
