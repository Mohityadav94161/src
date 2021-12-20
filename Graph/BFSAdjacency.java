import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BFSAdjacency {
    public static void main(String[] args) {
        //bfs
        ArrayList<ArrayList<Integer>>adj = new ArrayList<>(5); 
        int v = 5;
        for(int i = 0 ;i< v ;i++){
            adj.add(new ArrayList<Integer>());
        }
        put(adj,0,1);
        put(adj,0,2);
        put(adj,1,2);
        put(adj,1,3);
        put(adj,0,4);
        put(adj,4,2);
        put(adj,4,3);


        System.out.print(bfsOfGraph(v, adj));

        
    }
    public static ArrayList<Integer> bfsOfGraph(int v,ArrayList<ArrayList<Integer>> adj)
    {   
       ArrayList<Integer>arr = new ArrayList<>();
       Queue<Integer>q = new LinkedList<>();
        boolean visited[] = new boolean[v];
        int s = 0;
        q.add(s);
        visited[s] = true;
        while(q.isEmpty()==false){
            int a = q.poll();
            arr.add(a);
                for(int j: adj.get(a)){
                    if(!visited[j]){
                        q.add(j);
                        visited[j] = true;
                    }
                }                
        }
        return arr;
    }
    public static void put(ArrayList<ArrayList<Integer>>adj,int u, int v) {
        adj.get(v).add(u);
        adj.get(u).add(v);
    }
}
