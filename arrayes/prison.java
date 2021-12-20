package Array;
import java.util.*;

public class prison {

	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<Integer>();
		ArrayList<Integer> aq = new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 0; i<t; i++) {
        	int n = sc.nextInt();
        	for(int j =0; j<n; j++) {
        		arr.add(sc.nextInt());
        	}
        	while(arr.size()!=1) {
        		int r = arr.size();
        		for(int k = 0; k<r-1; k++) {
        			for(int g= 1; g<r-1; g++) {
        				if(gcd(arr.get((k+g-1)%(r)),arr.get((k+g)%(r))) ==1) {
        					System.out.print( arr.get((k+g)%r));
        					 arr.remove(arr.get((k+g)%r));
        					 
        				}
        					
        				}
        			}
        		if(arr.size() ==r ) {
        			break;
        		}
        		}
        }
        		
        	}
        	
        
	
	public static int gcd(int n1, int n2) {
		int gcds = 1;
	
		for (int i = 1; i <= n1 && i <= n2; ++i) {
               if (n1 % i == 0 && n2 % i == 0) {
		          gcds = i;
		        
		    }
		
	}
		return gcds;
	}
	}
	

