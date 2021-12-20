package Array;

public class BubbleSort {

	public static void main(String[] args) {
		int a[]= {2,4,2,8,34,1,4,7,-2};
		for(int i=0;i<a.length-1;i++) {
			for(int j=0;j<a.length-1-i;j++)
				if (a[j+1]<a[j]) {
					int temp = a[j+1];
					a[j+1]=a[j];
				
					a[j]=temp;		
				}
			for(int e:a) {
			System.out.print(e +" ");
			
			}
			System.out.println(" ");
		}

	}
}
