import java.util.*;

public class indgreeTopologicalSort {
    public static void main(String[] args) {
        int v =  6;
        ArrayList<ArrayList<Integer>>adj = new ArrayList<>();
        for(int i = 0 ;i< v; i++){
            adj.add(new ArrayList<>());
        }
        int []deg = new int[v];
        put(adj, 5, 2,deg);
        put(adj, 5, 0,deg);
        put(adj, 4, 0,deg);
        put(adj, 4, 1,deg);
        put(adj, 2, 3,deg);
        put(adj, 3, 1,deg);
        Queue<Integer>q = new LinkedList<>();
       
        for(int i = 0; i< v; i++){
            System.out.println("n "+deg[i] + " "+ i);
        }
        
            fina(q, deg, adj);
            
        
        
    }
        
    
    public static void put(ArrayList<ArrayList<Integer>>adj, int v, int u, int[]deg){
        adj.get(v).add(u);
        deg[u]++;
    }
    public static void fina(Queue<Integer>q,int[]deg,ArrayList<ArrayList<Integer>>adj) {
        for(int i = 0 ;i < deg.length; i++){
            if(deg[i]==0){
                q.add(i);
            }
        }
        

        while(!q.isEmpty()){
            int u = q.poll();
            System.out.println(u);
            for(int e :adj.get(u)){
                deg[e] = deg[e]-1;               
                if(deg[e]==0){
                    q.add(e);
                }
            }
        }
    }
}
