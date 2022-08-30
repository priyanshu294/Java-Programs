package Arrays_programs;

public class FindMaxOfSubarray {
	
	static void printKmax(int arr[], int n, int k) {
		int max;
		
		for(int i=0; i<=n-k; i++) {
			max = arr[i];
			for(int j=1; j<k; j++) {
				if(arr[i+j] > max) {
					max = arr[i+j];
				}
			}
			System.out.print(max + " ");
		}
	}

	public static void main(String[] args) {
		
		int arr[] = {1,2,3,1,4,5,2,3,6};
		int k = 3;
		printKmax(arr,arr.length,k);
		

	}

}
