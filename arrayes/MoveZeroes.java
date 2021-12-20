package Array;

public class MoveZeroes {

	public static void main(String[] args) {
		int a[] = {0,0,0,0,0,0,0,0,0,0,0,1};
		int count  = 0;
		int res = 0;
		for(int i = 0 ; i< a.length; i++) {
			if(a[count] == 0 && a[res] != 0) {
				int temp = a[count];
				a[count] = a[res];
				a[res] = temp;
				res ++;
				count++;
			}
			else if(a[count] == 0 && a[res]==0) {
				res ++;
			}
			else {
				res++;
				count++;
			}
		}
		for(int i = 0 ; i< a.length ; i++) {
			System.out.print(a[i] + "  ");
		}

	}

}
