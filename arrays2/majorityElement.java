package arrays2;

public class majorityElement {

	public static void main(String[] args) {
		int[] arr = {4,3,5,3,6};
		int n  = arr.length;
		majorty( arr,n);

	}
	public static int majorty(int arr[],int n) {
		int res = 0;
		int count = 1;
		for(int i = 1; i < n; i++) {
			if(arr[res] == arr[i]) {
				count++;
			}
			else {
				count--;
			}
			if(count==0) {
				res = i;
				count = 1;
			}
		}
		System.out.print(arr[res]);
		return res;
	}

}
  