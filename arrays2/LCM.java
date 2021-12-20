package arrays2;
import java.util.Scanner;

import java.util.*;

public class LCM {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int i = 0; i<t; i++ ) {
			int n = sc.nextInt();
			int k = sc.nextInt();
			int []a = new int[3];
			int x1 = n/k;
			int x2 = x1;
			int x3 = n- (x1 +x2);
			 System.out.print(rec( a,   x1 , x2, x3));
		}
		

	}
  public  static int[] rec(int [] a, int  x1 ,int x2,int x3) {
	  if(x2 % x1 ==0 && x3 % x1 == 0 && x3 % x2 == 0) {
		  a[0] = x1;
		  a[1] = x2;
		  a[2] = x3;
		 
		  return a;
		  
	  }
	  if(x1>x3) {
		  return null;
		  
	  }
	  else {
		           rec( a,  x1-1 , x2 +1, x3);
				   rec( a,  x1-1 , x2-1, x3+2);
	  }
	  
	return null;
	  
  }
}
