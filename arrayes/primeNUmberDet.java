package Array;
import java.util.*;

public class primeNUmberDet {

	public static void main(String[] args) {
		ArrayList<Integer>arr = new ArrayList<Integer>();
		int []arrprime = {1,2,-3,4,5,7};
		for(int i = 0 ; i < 6; i++) {
			if(prime(arrprime[i])==true) {
				arr.add(i);
			}
		}
		int count  = 0;
		int min = 1000000;
		int index = 0;
		for(int i = 0; i<arr.size()-1; i++) {
			for(int j = arr.get(i)+1 ; j<arr.get(i+1) ;j++) {
				if(arrprime[j] <0) {
					count++; 
				}
			}
			if(min>count) {
				index = arr.get(i+1)-arr.get(i);
				min  = count;
			}
		}
		System.out.print(index);
		

	}
	public static boolean prime(int n) {
		if(n<=1) {
			return false;
		}
		else if(n == 2) {
			return true;
		}
		for(int i = 3 ; i<= Math.sqrt(n) ; i+=2 ) {
			if(n % i == 0) {
				return false;
			}
		}
		return true;
	}

}
