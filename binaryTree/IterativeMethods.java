package binaryTree;
import java.util.Stack;


public class IterativeMethods {

	public static void main(String[] args) {
		node root        =  new node(76);
		 root.left        =  new node(6);
		 root.right       =  new node(176);
		 root.left.left   =  new node(276);
		 root.right.right =  new node(16);
		 root.right.left  =  new node(761);
		 root.left.right  =  new node(72);
		 System.out.print("The preorder traversal is : ") ;

		iPreorder(root);
		

	}
	public static void iPreorder(node root) {
		if(root == null) {
			return;
		}
		Stack<node> s = new Stack<node>();
		s.push(root);
		while(s.isEmpty()==false){
			node curr = s.pop();
			System.out.print(curr.key + " ");
//			if(root.left !=null) {
//				s.push(root.left);
//				
//			}
			if(root.right !=null) {
				s.push(root.right);
			}
			curr = curr.left;
			
		}
	}

}
