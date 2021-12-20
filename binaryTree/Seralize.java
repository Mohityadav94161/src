package binaryTree;
import java.util.*;

public class Seralize {

	public static void main(String[] args) {
		 node root        =  new node(10);
		 root.left        =  new node(20);
		 root.right       =  new node(30);
		 root.left.left   =  new node(30);
		 root.left.left.right   =  new node(40);
		 root.right.right =  new node(16);
		 root.right.left  =  new node(761);
		 root.left.right  =  new node(72);
		 System.out.println("The seralization is : ") ;
		 System.out.println();
         seralize(root);
        
		

	}
	static Queue<Integer> q = new LinkedList<Integer>();
	public static void seralize(node root) {
		if(root == null) {
			q.add(-1);
			return ;
		}
		q.add(root.key);
		seralize(root.left);
		seralize(root.right);
	}
	
	
}
