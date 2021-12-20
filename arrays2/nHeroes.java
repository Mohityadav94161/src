package arrays2;
import java.util.Arrays;

public class nHeroes {

	public static void main(String[] args) {
		int[]  a = {2,34,1,1,1,52,14,2};
		int n = 8;
		winner(n,a);
		

	}
	
public static int winner(int n,int arr[]) { 
	int count = 0;
    Arrays.sort(arr);
	for(int i= 1;i<n;i++ ){
		
		if(arr[i] == arr[0]) {	
			count++;
			}
			else {
				System.out.println(arr.length-count-1);
				return arr.length - count-1;
			
		}
		
		
	}
	return n;
	
}
}
