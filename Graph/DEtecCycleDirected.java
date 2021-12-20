
import java.util.ArrayList;

public class DEtecCycleDirected {
    public static void main(String[] args) {
        int v = 6;
        ArrayList<ArrayList<Integer>>adj = new ArrayList<>();
        for(int i =0; i< v; i++){
            adj.add(new ArrayList<>());
        }
        put(adj, 0, 1);
        put(adj, 2, 1);
        put(adj, 2, 3);
        put(adj, 3, 4);
        put(adj, 4, 5);
        put(adj, 5, 3);
        boolean []visited = new boolean[v];
        boolean []rec = new boolean[v];
        
        System.out.print(all(adj,v,visited,rec));
    }
    public static void put(ArrayList<ArrayList<Integer>>adj,int u, int v){
        adj.get(u).add(v);
        
        
    }
    public static boolean loop(ArrayList<ArrayList<Integer>>adj,int v,int s, boolean[] visited, boolean[] rec ){
        visited[s] = true;
        rec[s]  = true;
        for(int e: adj.get(s)){
            if(!visited[e]){
                visited[e] = true;
               if(loop(adj, v, e, visited, rec)){
                   return true;
               }   
            }
            else if(rec[e]){
                return true;
            }
        }
        rec[s] = false; 
        return false;
    }
    public static boolean all(ArrayList<ArrayList<Integer>> adj,int v,boolean[] visited,boolean []rec){
        for(int i =0 ; i< v ; i++){
            if(!visited[i] && loop(adj, v, i, visited, rec)){
                return true;

            }

        }
        return false;
    }
    
}
