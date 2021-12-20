package Graph;

import java.util.ArrayList;

public class DFS {
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

//		for(int i = 0; i< v; i++) {
			print(m,0);
//		}
		
	}
	public static void DFSs(ArrayList<ArrayList<Integer>>m ,int s,boolean []a) {
		a[s] = true;
		System.out.print(s + " ");
		for(int i=  0; i< m.get(s).size(); i++) {
			if(a[i]==false) {
				DFSs(m,i,a);
			}
		}
		
		
		
	}
	public static void print(ArrayList<ArrayList<Integer>>m ,int s) {
		boolean []a = new boolean[m.size()];
		DFSs(m,s,a);
	}

	}


