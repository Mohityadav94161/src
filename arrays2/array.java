package arrays2;
import java.util.*;


public class array{

	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		
		int t = sc.nextInt();
		String s = "1+2+2+2";
		
		for(int i  = 0; i<t;i++) {
		int n = sc.nextInt();
			int b = sc.nextInt();
			int arr[] = new int[n];
			for(int j= 0; j<n; j++) {
				arr[i] = sc.nextInt();
			}
			Arrays.sort(arr);
			int sum = b;
			int count = 0;
			for(int k = 0; k<n; k++) {
				if(sum>=arr[i]) {
					sum = sum - arr[i];
					System.out.println("sum is "+ sum+" and arr[i] is "+ arr[i]);
					count++;
				}
				if(sum==0 || sum < arr[i]) {
					break;
				}
			}
		
			System.out.println(count);
		}

	}

}
