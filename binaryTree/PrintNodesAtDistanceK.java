package binaryTree;
public class PrintNodesAtDistanceK {

	public static void main(String[] args) {
		node root        =  new node(76);
		 root.left        =  new node(6);
		 root.right       =  new node(176);
		 root.left.left   =  new node(276);
		 root.right.right =  new node(16);
		 root.right.left  =  new node(761);
		 root.left.right  =  new node(72);
		 print(root,2);
		

	}
	public static void print(node root,int k) {
		if(root==null) {
			return;
		
		}
		if(k==0) {
			System.out.print(root.key +" ");
		}
		print( root.left,k-1);
		print( root.right,k-1);
		
	}

}
