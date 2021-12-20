import java.util.Arrays;
import java.util.Scanner;
public class div26_11A {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int i = 0 ; i< t ; i++) {
			int n = sc.nextInt();
			int l = sc.nextInt();
			int r = sc.nextInt();
			int k = sc.nextInt();
			int[]arr = new int[n];
			int ii =0 ;
			int q = n;
			while(n-->0) {
				arr[ii++] = sc.nextInt();
			}
			System.out.println(isvalid(n,l,r,k,arr));
		}
		
	}
	public static int isvalid(int n , int l , int r ,int k ,int arr[]) {
	
		int count = 0;
		Arrays.sort(arr);
		int q = arr.length;
		int i = 0;
		while(q-->0) {
			if(arr[i]>=l&&arr[i]<=r&&arr[i]<=k) {
				count++;
				k -= arr[i];
			}
			if(k<arr[i]) {
				break;
			}
			i++;
		}
//		System.out.println(count);
		return count;
	}

}
