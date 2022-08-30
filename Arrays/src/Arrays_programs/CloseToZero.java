package Arrays_programs;

import java.util.Arrays;

public class CloseToZero {

	public static void main(String[] args) {
	
		int [] data = {4,3,-2,5,8,6,-4,5,7,-23};
		int cur = 0;
		int n = data[0];
		Arrays.sort(data);
		
		System.out.println(Arrays.toString(data));
		//find
		for(int i=0; i<data.length; i++) {
			System.out.println("dist from " + data[i] + "=" + Math.abs(0 -data[i]));
			cur = data[i] * data[i];
			if(cur<=(n*n)) {
				n = data[i];
			}
		}
		System.out.println(n);

	}

}
