package Stack;
import java.util.Scanner;
import java.util.Stack;

public class StockSpan {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int []arr = new int[n];
		for(int i = 0; i< n;i++) {
			arr[i] = sc.nextInt();
			
		}
		span(arr,n);
	}
//		function call
		

	
	public static void span(int[]arr,int n) {
		Stack<Integer>sp = new Stack<Integer>();
		sp.push(0);
		System.out.print(1 + " ");
		for(int i = 1; i< n; i++) {
		
		while(sp.isEmpty()==false && arr[sp.peek()]<=arr[i]) {
			sp.pop();
		}
		int span  = (sp.isEmpty())?i+1:i-sp.peek();
		System.out.print(span + " ");
		sp.push(i);
		}
		
		
	}

}

