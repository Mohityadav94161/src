package arrays2;

import java.util.ArrayList;



public class BinaryNumber {
	static ArrayList<Integer> arr = new ArrayList<Integer>();

	public static void main(String[] args) {
		binarynumber(-8);
		for(int i = arr.size()-1 ; i>=0  ; i--) {
			System.out.print(arr.get(i));
		}
		

	}
	static int binarynumber(int answer) {
		if(answer == 0) {
			if (answer>0)
				return 0;
			else
				return 1;
		  
		}
		 arr.add(answer%2);
		answer = (int)answer/2;
//		System.out.print(arr);
		return binarynumber(answer);
	}


}
