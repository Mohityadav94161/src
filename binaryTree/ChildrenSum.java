package binaryTree;

public class ChildrenSum {

	//Tree structure is in node.java file so, have a look to understand the tree
	
	public static void main(String[] args) {
		 node root        =  new node(20);
		 root.left        =  new node(8);
		 root.right       =  new node(12);
		 root.left.left   =  new node(3);
//		 root.left.left.right   =  new node(40);
		 root.right.right =  new node(16);
//		 root.right.left  =  new node(761);
		 root.left.right  =  new node(5);
		System.out.print(csp(root)); 
		

	}
	public static boolean csp(node root) {
		int sum = 0;
		if (root ==null) {
			return true;
		}
		if(root.left ==null && root.right==null) {
			return true;
		}
		if(root.left != null) {
			sum += root.left.key;
		}
		if(root.right!=null) {
			sum +=root.right.key;
		}
		
		return (root.key==sum && csp(root.left) && csp(root.right));
		
	}

}
