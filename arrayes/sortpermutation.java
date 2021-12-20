package Array;
import java.util.*;

public class sortpermutation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->=0){
			int n = sc.nextInt();
			int arr[] = new int[n];
			int k = 0;
			for(int i = 0; i< n; i++ ) {
				arr[i] =sc.nextInt();
			}
			for(int i = 0 ; i < n; i++) {
				for(int j = 1; j< n;j++) {
					if(arr[j]<arr[j-1]) {
						k++;
						int temp = arr[j];
						arr[j] = arr[j-1];
						arr[j-1] = temp;
					}
				}
			}
			System.out.println(k);
		}

	}

}
