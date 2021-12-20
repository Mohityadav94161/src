package arrays2;
import java.util.*;


public class codeforcesA {

	public static void main(String[] args) {
		ArrayList<Integer>Arr = new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);
		int t  = sc.nextInt();
		//no of test cases
		int count = 0; 
		for(int k = 0 ; k< t ; k++) {
			//no of elements
			int i = sc.nextInt();
			int arr[] = new int[i];
			for( int j = 0 ; j< i ; j++) {
				arr[j] = sc.nextInt();
			}
			count = 0;
			for(int q = 0 ; q<= i ;q++) {
				for(int r = q+1; r<i ; r++) {
					if(r-q == arr[r]-arr[q]) {
						count++;
					}
				}
			}
			Arr.add(count);
		}
		for(int h = 0 ; h<Arr.size(); h++) {
			System.out.println(Arr.get(h));
		}

	}

}
