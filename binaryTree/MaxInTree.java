package binaryTree;

public class MaxInTree {

	public static void main(String[] args) {
		 node root        =  new node(76);
		 root.left        =  new node(6);
		 root.right       =  new node(176);
		 root.left.left   =  new node(276);
		 root.right.right =  new node(16);
		 root.right.left  =  new node(761);
		 root.left.right  =  new node(72);
		 System.out.print(max(root));
		

	}
	public static int max(node root) {
		
		if(root == null) {
			return Integer.MIN_VALUE;
		}
		return  Math.max(root.key,Math.max(max(root.left), max(root.right)));
		
	}
}


