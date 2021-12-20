package binaryTree;
import java.util.*;

public class identical {

	public static void main(String[] args) {
//		ArrayList<Integer>arr1 = new  ArrayList<Integer>();
//		ArrayList<Integer>arr2= new  ArrayList<Integer>();\
		ArrayList<Integer>arr = new  ArrayList<Integer>();
        ArrayList<Integer>arr1 = new  ArrayList<Integer>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        arr1.add(3);
        arr1.add(4);
        arr1.add(51);
       
        System.out.print("not "+ arr.containsAll(arr1));
		
//		node root1 = new node(1);
//		root1.left = new node(3);
//		root1.right = new node(5);
//		
//		node root2 = new node(1);
//		root2.left = new node(3);
//		root2.right = new node(5);
//     System.out.println(isIdentical( root1,  root2));
//	}
//	public static ArrayList<Integer> pre(node root){
//        ArrayList<Integer>arr = new  ArrayList<Integer>();
//        ArrayList<Integer>arr1 = new  ArrayList<Integer>();
//        arr.add(1);
//        arr.add(2);
//        arr.add(3);
//        arr.add(4);
//        arr.add(5);
//        arr1.add(3);
//        arr1.add(4);
//        arr1.add(5);
//        arr.contains(arr1);
//         
//		if (root == null) {
//			return null;
//		}
//		Queue<node>q = new LinkedList<node>();
//		
//		q.add(root);
//        while(q.isEmpty()==false) {
//        	
//        	int count = q.size();
//        	for(int i =0; i< count;i++) {
//        		node curr = q.poll();
//                arr.add(curr.key);
//        		if(curr.left != null) {
//        			q.add(curr.left);
//        		}
//        		if(curr.right != null) {
//        			q.add(curr.right);
//        		}
//        		
//        	}
//        }
//        for(int o = 0; o<arr.size();o++) {
//        	if(arr.containsAll(a)[o]==arr[o]) {
//        		
//        	}
//        }
//        return arr;
//		
//		}
//
//    
//    
//	public static boolean isIdentical(node root1, node root2)
//	{
//	    return pre(root1).equals(pre(root2));
//	}

}}
