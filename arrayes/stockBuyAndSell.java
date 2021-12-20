package Array;
import java.util.*;

public class stockBuyAndSell {

	public static void main(String[] args) {
		int A[] = {4,2,2,2,4};
		int n = 5;
		System.out.print(stockBuySell( A, n));

	}
	public static ArrayList<ArrayList<Integer> > stockBuySell(int A[], int n) {
        ArrayList<ArrayList<Integer>>arr = new ArrayList<ArrayList<Integer>>();
        if(n==0||n==1){
            return arr;
        }
        for(int i = 0; i< n-1; i++){
            ArrayList<Integer>a = new ArrayList<Integer>();
            if(A[i+1]>A[i]){
                a.add(i);
                a.add(i+1);
            }
            if(a.isEmpty()==false) {
            arr.add(a);
            }
            
            
            
        }
        return ;
    }

}
