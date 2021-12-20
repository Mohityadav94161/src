package Array;

public class selectionSort {

	public static void main(String[] args) {
		

	
	int a[]= {1,6,36,73,6,0};
	for(int i=0; i<a.length;i++) {
		int minnum = i;
		for(int j=0;j<a.length;j++) {
			if (a[j]<a[minnum]) {
				
				
			
		int temp =a[j];
		a[j] = a[minnum];
		a[minnum] = temp;
		}
		}for(int w:a) {
			System.out.print(w +" ");
	}System.out.println(" ");
	}

	

	
}
}