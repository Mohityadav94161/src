package Stack;
import java.util.Stack;
import java.util.Scanner;

public class PreviousGreaterElement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int []arr = new int[n];
		for(int i = 0; i< n;i++) {
			arr[i] = sc.nextInt();
			
		}
		pge(arr,n);

	}
	
	public static void pge(int[] arr, int n) {
		Stack<Integer>s = new Stack<Integer>();
		s.push(arr[0]);
		for(int i = 0 ;i < n; i++) {
			while(s.isEmpty()==false && s.peek()<arr[i]) {
				s.pop();
			}
			int greater = (s.isEmpty())? -1 : s.peek();
			System.out.print(greater + " ");
			s.push(arr[i]);
		
		}
		
		
		
	}

}
