package binaryTree;
import java.util.LinkedList;
import java.util.Queue;


public class LevelOrderTraversal {

	public static void main(String[] args) {
		 node root        =  new node(76);
		 root.left        =  new node(6);
		 root.right       =  new node(176);
		 root.left.left   =  new node(276);
		 root.right.right =  new node(16);
		 root.right.left  =  new node(761);
		 root.left.right  =  new node(72);
		 System.out.println("The preorder traversal is : ") ;

		LevelOrder(root);
		
	}
	public static void LevelOrder(node root) {
		if (root == null) {
			return;
		}
		Queue<node>q = new LinkedList<node>();
		
		q.add(root);
		int c= 0;
        while(q.isEmpty()==false) {
        	
        	int count = q.size();
        	for(int i =0; i< count;i++) {
        		node curr = q.poll();
        		System.out.print(curr.key + " ");
        		if(curr.left != null) {
        			q.add(curr.left);
        		}
        		if(curr.right != null) {
        			q.add(curr.right);
        		}
        		
        	}
        	System.out.println(" ");
        	c++;
        	
        
        }
        System.out.println(c + "height");
		
		}
	

}
