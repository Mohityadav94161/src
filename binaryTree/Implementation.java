package binaryTree;


public class Implementation {

	public static void main(String[] args) {
		
//Tree structure is in node.java file so, have a look to understand the tree
		
		 node root        =  new node(76);
		 root.left        =  new node(6);
		 root.right       =  new node(176);
		 root.left.left   =  new node(276);
		 root.right.right =  new node(16);
		 root.right.left  =  new node(761);
		 root.left.right  =  new node(72);
		 System.out.print("The preorder traversal is : ") ;

		preorder(root);
		System.out.println(" ") ;
		System.out.print("The inorder traversal is : ");

		inorder(root);
		System.out.println(" ") ;
		System.out.print("The postorder traversal is : ");

		postorder(root);
		System.out.println(" ") ;
		System.out.print("size is :"+ getsize(root));

	}
	public static void preorder(node root) {
		if(root!=null) {
		  
		  System.out.print( root.key +" ");
		  preorder(root.left);
		  preorder(root.right);
		}
		
	}
	public static void inorder(node root) {
		if(root!=null) {
		  inorder(root.left);
		  System.out.print(root.key +" ");
		  
		  inorder(root.right);
		}
		
	}
	public static void postorder(node root) {
		if(root!=null) {
		  postorder(root.left);
		  postorder(root.right);
		  System.out.print(root.key +" ");
		  
		  
		}
		
	}
	public static int getsize(node root) {
		if(root != null) {
			return 1+getsize(root.left)
			+ getsize(root.right);
		}
		else {
		return 0;
	}
	}

}
