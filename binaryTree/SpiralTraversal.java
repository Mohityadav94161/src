package binaryTree;

import java.util.LinkedList;
import java.util.*;

public class SpiralTraversal {

	public static void main(String[] args) {
		 node root        =  new node(76);
		 root.left        =  new node(6);
		 root.right       =  new node(176);
		 root.left.left   =  new node(276);
		 root.right.right =  new node(16);
		 root.right.left  =  new node(761);
		 root.left.right  =  new node(72);
		 spiral(root);

	}
	public static void spiral(node root) {
		boolean reverse = false;
		if(root ==null) {
			return;
		}
		Queue<node>q = new LinkedList<node>();
		Stack<node>s = new Stack<node>();
		q.add(root);
		while(q.isEmpty()==false) {
			int count = q.size();
			
			for(int i = 0; i<count;i++) {
				node curr = q.poll();
				if(reverse) { 
					s.push(curr);
				}

				else{
					System.out.print(curr.key +" ");
				}
				
				
				if(curr.left != null) {
					q.add(curr.left);
				}
				if(curr.right != null) {
					q.add(curr.right);
				}


			}
			System.out.println(" " );
			if(reverse) {
				while(s.isEmpty()==false) {
					System.out.print(s.pop().key +" ");
				}
				System.out.println(" " );
			}
			reverse = !reverse;

		}


		}
		
	}


