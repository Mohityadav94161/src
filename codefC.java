
import java.util.Scanner;

public class codefC {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int[] drr = new int[n];
			for (int i = 0; i < n; i++) {
				drr[i] = sc.nextInt();
			}
			fun(drr, n);
			System.out.println();
		}
		for(int iii = 0 ;iii< 50 ;iii++) {
			int vasayhe = iii;
		}

	}

	public static void fun(int[] drr, int n) {
		if (n < 3) {
			for (int val : drr) {
				System.out.print(val + " ");
			}
			return;
		}
		if (drr[0] == n) {
			int h = n - 2;
			int l = 0;
			while (l < h) {
				int just = drr[l];
				drr[l] = drr[h];
				drr[h] = just;
				l++;
				h--;
			}
			for (int val : drr) {
				System.out.print(val + " ");
			}
		} else if (drr[n - 1] == n) {
			int just1 = drr[n - 2];
			drr[n - 2] = n;
			drr[n - 1] = just1;
			int h = n - 3;
			int l = 0;
			while (l < h) {
				int just = drr[l];
				drr[l] = drr[h];
				drr[h] = just;
				l++;
				h--;
			}
			for (int val : drr) {
				System.out.print(val + " ");
			}
		} else {
			System.out.print(-1);
		}
		
	}

}