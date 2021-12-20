package Array;
import java.util.*;

public class ArrivalOfGeneral {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int []m = new int[n];
		for(int i =0 ; i< n; i++) {
			m[i] = sc.nextInt();
		}
		int x = Integer.MIN_VALUE;
		int x1 = 0;
		for(int i = 0; i< n;i++) {
			if(x<m[i]) {
				x = m[i];
				x1 = i;
				
			}
		}
		int y = Integer.MAX_VALUE;
		int y1 = 0; 
		for(int i = 0; i< n;i++) {
			if(m[i]<=y) {
				y = m[i];
				y1 = i;
			}
		}
		if(x1<y1) {
//			System.out.println("The value of greater : " + x1 );
			System.out.print(x1 +n-y1-1);
		}
		if(x1>y1) {
//			System.out.println("The value of smaller : " + (y1));
			System.out.print(x1+ n-y1 -2);
		}
	}

}
