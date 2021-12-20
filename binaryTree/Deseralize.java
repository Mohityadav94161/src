package binaryTree;

public class Deseralize {

	public static void main(String[] args) {
		int []arr = {10 ,20 ,30 ,-1 ,40 ,-1 ,-1 ,-1 ,-1 };
		deseralize(arr);

	}
	public static node deseralize(int arr[]) {
		for(int i = 0 ; i< arr.length-1; i++) {
			node root = new node(arr[i]);
			if( arr[i]==-1) {
			 root = null;
			 
			
			}
			else {
				System.out.print(root.key + " ");
				root.left = new node(arr[i]);
				root.right = new node(arr[i+1]);
				
				
			}
			
		}
		
		return null;
		
	}

}
