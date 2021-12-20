import java.util.ArrayList;
import java.util.Stack;

public class TopologicalSorting {
    public static void main(String[] args) {
    //topolog\
        int v = 6;
        ArrayList<ArrayList<Integer>>adj = new ArrayList<>();
        for(int i = 0 ; i< v; i++){
            adj.add(new ArrayList<>());
        }
        boolean[]visited = new boolean[v];
        put(adj, 5, 2);
        put(adj, 5, 0);
        put(adj, 4, 0);
        put(adj, 4, 1);
        put(adj, 2, 3);
        put(adj, 3, 1);
        sort(adj, v, visited);
           
        
    
    }
    public static void sort(ArrayList<ArrayList<Integer>>adj, int v,boolean[]visited) {       
        int j = 0;
        int arr[] = new int[v];
        Stack<Integer>st = new Stack<>();
         for(int i = 0 ; i< v; i++){
             if(!visited[i]){
                 Dfs(adj, st, i, visited);
             }
         }
        while(!st.empty()){

            arr[j] = st.pop();
            j++;
        }
        
    }
    public static void Dfs(ArrayList<ArrayList<Integer>>adj, Stack<Integer>s,int e,boolean[]visited){
        visited[e] = true;
        for(int q:adj.get(e)){
            if(!visited[q]){
                Dfs(adj, s, q, visited);
            }
        }
        s.push(e); 
    }
    public static void put(ArrayList<ArrayList<Integer>>adj,int v,int u) {
        adj.get(v).add(u);
    }
}
