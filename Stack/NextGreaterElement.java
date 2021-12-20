package Stack;

import java.util.Scanner;
import java.util.Stack;

public class NextGreaterElement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int []arr = new int[n];
		for(int i = 0; i< n;i++) {
			arr[i] = sc.nextInt();
			
		}
		nge(arr,n);

	}
	public static void nge(int[]arr,int n ) {
		Stack<Integer> s = new Stack<Integer>();
		s.push(arr[n-1]);
		for(int i = n-1; i>= 0; i--) {
			while(s.isEmpty()==false && arr[i]>s.peek()) {
				s.pop();
			}
			int g = (s.isEmpty())? -1: s.peek();
			System.out.print(g + " ");
			s.push(arr[i]);
		}
	}

}
