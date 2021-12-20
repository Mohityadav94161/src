package binaryTree;

import java.util.ArrayList;

public class Inorde {

	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<Integer>();
		ArrayList<Integer> b =  new ArrayList<Integer>();
		 node root1        =  new node(76);
		 root1.left        =  new node(6);
		 root1.right       =  new node(176);
		 root1.left.left   =  new node(276);
		 
		 node root        =  new node(76);
		 root.left        =  new node(6);
		 root.right       =  new node(176);
		 root.left.left   =  new node(276);
		 root.right.right =  new node(16);
		 root.right.left  =  new node(761);
		 root.left.right  =  new node(72);
		System.out.println("root1"+pre(root1,a));
        System.out.println(pre(root,b));
		

	}
	 public static ArrayList<Integer> pre(node root,ArrayList<Integer> a){
	        
	        if(root!=null){
	            
	        
	            pre(root.left,a);
	            a.add(root.key);
//	            System.out.print(a + " ");
	            pre(root.right,a);
	        }
	        return a;
	    }

}
