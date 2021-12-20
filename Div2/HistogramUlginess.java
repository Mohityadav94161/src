package Div2;
import java.util.Scanner;

public class HistogramUlginess {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
		while(t-->0){
			int n = sc.nextInt();
			int[] a = new int[n];
			for(int i = 0; i < n; i++){
				a[i] = sc.nextInt();
			}
			long u = a[0] + a[n - 1];
			if(n == 1){
				u = a[0];
			}
			for(int i = 1; i < n - 1; i++){
				if(a[i] > a[i - 1] || a[i] > a[i + 1]){
					u += a[i] - Math.min(a[i - 1], a[i + 1]);
				}
			}
			System.out.println(u);
		}
		sc.close();
    }
}
