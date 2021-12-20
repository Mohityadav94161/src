package binaryTree;

import java.util.*;

public class Verticalsum {

	public static void main(String[] args) {
		TreeMap<Integer,Integer>hm = new TreeMap<>();
		node root = new node(10);
		root.left = new node(20);
		root.left.left = new node(5);
		root.right = new node(30);
		root.left.right = new node(15);
		vt(root,0,hm);
		for(Map.Entry<Integer, Integer> sum: hm.entrySet()) {
			System.out.println(sum.getKey() +" == " + sum.getValue() + hm.firstKey());
		}
		
		
	}
	public static void vt(node root, int hd , TreeMap<Integer,Integer>hm) {
		if(root != null) {
			vt(root.left, hd-1,hm);
			int psum=(hm.get(hd)==null?0:hm.get(hd));
			hm.put(hd,psum+root.key);
			vt(root.right , hd+1 , hm);
		}
	}

}
