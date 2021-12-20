package binaryTree;

import java.util.*;
import java.util.Map.Entry;


class pair{
	int h;
	ArrayList<Integer>ar;
	public pair(int hd, ArrayList<Integer>arr ) {
		 h = hd;
		 ar =arr;
	}
}

public class VerticalTraversal {

	public static void main(String[] args) {
		node root        =  new node(76);
		 root.left        =  new node(6);
		 root.right       =  new node(176);
		 root.left.left   =  new node(276);
		 root.right.right =  new node(16);
		 root.right.left  =  new node(761);
		 root.left.right  =  new node(72);
		 TreeMap<Integer,ArrayList<Integer>>mp = new TreeMap<Integer,ArrayList<Integer>>();
		 ArrayList<Integer>arr = new ArrayList<Integer>();
		 ver( root, 0, mp , arr);
		 print(mp);
		 
		 

	}
	public static void ver(node root,int hd, TreeMap<Integer,ArrayList<Integer>>mp , ArrayList<Integer>arr) {
		if(root ==null ) {
			return;
		}
		ver(root.left,hd-1,mp,arr);
		if(mp.get(hd) == null) {
			hd= 0;
		}
		else {
			mp.get(hd);
		}
		arr.add(root.key);
		mp.put(hd,arr);
		ver(root.right,hd+1,mp,arr);
		
	}
	public static void print(TreeMap<Integer,ArrayList<Integer>>mp) {
		for(Entry<Integer, ArrayList<Integer>> n: mp.entrySet()) {
			System.out.print(((Entry<Integer, ArrayList<Integer>>) mp).getValue() + " ");
		}
		
		
		
	}
	
	
	
	

}
