package binaryTree;

public class BalancedTree {
	
	//Tree structure is in node.java file so, have a look to understand the tree

	public static void main(String[] args) {
		 node root        =  new node(20);
		 root.left        =  new node(8);
		 root.right       =  new node(12);
		 root.left.left   =  new node(3);
		 root.left.left.right   =  new node(40);
		 root.right.right =  new node(16);
		 root.right.left  =  new node(761);
		 root.left.right  =  new node(5);
		System.out.print(is(root));

	}
	public static boolean is(node root) {
		if(root == null) {
			return true;
		}
		int lh = 1+isl(root.left);
		int rh = 1+isl(root.right);
		return Math.abs(rh-lh)<=1 && is(root.left) && is(root.right);
	}
	public static int isl(node root) {
		if(root == null) {
			return 0;
		}
		return 1+Math.max(isl(root.left),isl(root.right));
	}

}
