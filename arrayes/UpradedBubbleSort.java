package Array;

public class UpradedBubbleSort {

	public static void main(String[] args) {
		int a[]= {2,6,4,9,8,9,-1,-5,4,-2,3};
		
		for (int i=0;i<a.length-1;i++) {
			Boolean sorted = true;
			for (int j=0;j<a.length-1-i;j++) {
			if(a[j+1]<a[j]) {
			int temp = a[j+1];
			a[j+1]=a[j];
			a[j]=temp;
			sorted =false;

			
			}
//			
			}
			if(sorted) break;
			for(int e:a) {
				System.out.print(e+" ");}
			System.out.println("\n ");
		}
			
		}
}
