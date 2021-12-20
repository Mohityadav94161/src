package Array;
import java.util.*;
public class codefo {

	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			while(n-->0) {
				int a = sc.nextInt();
				
				int []arr = new int[20000];
				int []temp = new int[a];
				for(int i =0 ; i< a ; i++) {
					int s = sc.nextInt();
					temp[i] = s;
					arr[s]++;
				}
				
				int count = 0;

				for(int i =0 ; i< arr.length ; i++) {
					if(arr[i]%2 != 0) {
						count++;
					}
				}
//				System.out.println(arr[temp[a-1]]);
//				System.out.println(count);
				
			   if(count>2) {
				   System.out.println("No");
			   }
			   
			   else System.out.println("yes");
				
				
			}

	}

}
