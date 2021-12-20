package binaryTree;
import java.util.*;

//                                 [20]
//								   /   \
//                                /     \	
//                              [8]      [12]
//                              / \      /  \
//							   /   \    /    \
//                           [3]   [5] [761] [16]   
//                           /
//                         [40]
                             
public class MaxWidth {
	public static void main(String[] args) {
		 node root        =  new node(20);
		 root.left        =  new node(8);
		 root.right       =  new node(12);
		 root.left.left   =  new node(3);
		 root.left.left.right   =  new node(40);
		 root.right.right =  new node(16);
		 root.right.left  =  new node(761);
		 root.left.right  =  new node(5);
		System.out.print(width(root));
		

	}
	public static  int width(node root) {
	if(root == null) {
		return 0;
	}
	Queue<node>q = new LinkedList<node>();
	int res = 0;
	q.add(root);
    while(q.isEmpty()==false) {
    	int count = q.size();
    	for(int i =0; i< count;i++) {
    		node curr = q.poll();
//    		System.out.print(curr.key + " ");
    		if(curr.left != null) {
    			q.add(curr.left);
    		}
    		if(curr.right != null) {
    			q.add(curr.right);
    		}
		}
    	res = Math.max(res, count);
	}
		

	return res;

}
}
