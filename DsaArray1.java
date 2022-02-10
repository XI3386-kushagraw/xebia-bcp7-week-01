import java.util.Scanner;


public class DsaArray1 {

	static int sequence(int n,int arr[]) {
				
		int maxLen=0,len=1,curr=arr[0],end=0;
				
		for(int i=1;i<n;i++) {
			//Comparing whether the next element is same if yes then count the sequence from next
			if(arr[i-1]==arr[i]) {
				continue;
			}
			//comparing with next if it is the next greater one than count as a sequence
			if(arr[i]==++curr) {
				len++;
				end=i;
			}
			//if its neither consecutive nor same start with that number
			else {
				len=1;
				curr=arr[i];
			}
			//Updating the length of the subsequence
			maxLen = Math.max(maxLen, len);
		}
		//The positions of that elements are +2 because we have taken array from 0
		System.out.println("The sequnce exists in between "+(end-maxLen+2)+ " and "+(end+1));
//		System.out.println(end);
		System.out.println("The elements are: ");
		//Printing the elements
		for(int i=end-maxLen+1;i<end+1;i++) {
			System.out.print(arr[i]+",");
		}
		System.out.println();
		
		
					
		return maxLen;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Creating scanner class object
		Scanner sc=new Scanner(System.in);

		
		//Taking the number input
		System.out.println("Enter the number of elements in an array");
		int n = sc.nextInt();
	
		//Declaring array
		int arr[]=new int[n];
	
		//Taking input in array
		System.out.println("Enter the array elements");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}

		int maxLen = sequence(n,arr);
		
		System.out.println("The largest common subsequence length is: "+maxLen);
		
		sc.close();
	}

}
