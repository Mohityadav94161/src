package Graph;

import java.util.ArrayList;
import java.util.*;

public class BFS {
	public static void insert(ArrayList<ArrayList<Integer>>g,int v,int u) {
		 g.get(v).add(u) ;
		 g.get(u).add(v) ;
		 
		    
		
	}
	public static void main(String[] args) {
		int v = 8;
		boolean []a = new boolean[v+1];
        ArrayList<ArrayList<Integer>>m = new ArrayList<ArrayList<Integer>>(v);
		
		for(int i = 0 ; i < v; i++) {
			m.add(new ArrayList<Integer>());
			
		}
		
		insert(m , 0 , 1);
		insert(m , 0 , 2);
		insert(m , 0 , 5);
		insert(m , 1 , 3);
		insert(m , 1 , 4);
		insert(m , 2 , 3);
		insert(m , 2 , 7);
		insert(m , 4 , 7);
		insert(m , 5 , 6);
		insert(m , 6 , 7);

		
			BFSs(m,a,0);
		
		
	}
	
	public static void BFSs(ArrayList<ArrayList<Integer>>m,boolean []a,int v) {
		Queue<Integer> q = new LinkedList<Integer>();
		
		q.add(v);
		a[v] = true; 
		while(q.isEmpty() == false) {
			int u = q.poll(); 
			System.out.print(" "+ u);
			for(int i = 0;i< m.get(u).size(); i++) {
				if(a[i] == false) {
					a[i] = true;
				    q.add(i);
				    
				}
			}
//			System.out.println(" ");
		}
		
	}
	
    
}



//         0--------1
//        /|       / \
//       / |      /   \
//      5--2-----3-----4
//      |  |          / 
//      |  |         /
//      |  |        / 
//      |  |       /
//      |  |      /    
//      |  |     / 
//      |  |    /
//      |  |   /
//      |  |  / 
//      6--7

