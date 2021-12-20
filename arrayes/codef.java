package Array;

import java.util.ArrayList;
import java.util.Scanner;

public class codef {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t =  sc.nextInt();
		while(t-->0) {
			int n = sc.nextInt();
			ArrayList<Integer>arr = new ArrayList<>();
			for(int i = 0 ; i< n ; i++) {
				arr.add(sc.nextInt());
			}
			boolean check = false;
			if(arr.size()<=1) {
				System.out.println("impossible");
				check = true;
			}
			int ans = 0 ;
			int ii = arr.size()-1 ;
			
			while( ii>=0) {
				if(arr.get(ii)%(ii+2)==0) {
					System.out.println("impossible");
					System.out.println("index "+ (ii+1) + " element "+ arr.get(ii));
					System.out.println("ii+1-ans "+(ii+2-ans));
					check = true;
					break;
				}
				else if(arr.get(ii)%(ii+2) != 0) {
					ans++;
				}
				ii++;
			}
			
			if(!check) {
			   System.out.println("possible");
			}
		}
		sc.close();

	}

}
