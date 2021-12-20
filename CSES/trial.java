import java.util.*;
public class trial {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
		long n=in.nextLong();
		long count=0;
		long[] arr=new long[(int) n+1];
		for (int i = 1; i < n+1; i++) {
			arr[i]=in.nextLong();
            // System.out.println("arr[i] is "+arr[i] + " arr[i-1] is "+ arr[i-1]);
			if(arr[i]-arr[i-1]<0) {
				count+=Math.abs(arr[i]-arr[i-1]);
				arr[i]=arr[i-1];
			}
		}
		System.out.println(count);
    }
}
