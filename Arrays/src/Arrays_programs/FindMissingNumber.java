package Arrays_programs;

import java.util.Scanner;

public class FindMissingNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the n value:");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter (n-1) numbers:");
		for(int i=0; i<=n-2; i++) {
			arr[i] = sc.nextInt();
		}
		//Logic
		int sumOfall = (n*(n+1))/2;
		int sumOfarr = 0;
		for(int i=0; i<=n-2; i++) {
			sumOfarr = sumOfarr+arr[i];
		}
		int ms = sumOfall - sumOfarr;
		System.out.println("Missing number:" +ms);

	}

}
