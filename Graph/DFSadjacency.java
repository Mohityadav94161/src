import java.util.ArrayList;

public class DFSadjacency {
    public static void main(String[] args) {
        //DfS search
        ArrayList<ArrayList<Integer>>adj = new ArrayList<>();
        int v = 7;
        for(int i = 0 ;i< v ;i++){
            adj.add(new ArrayList<Integer>());
        }
        boolean[] visited = new boolean[7];
        put(adj,0,1);
        put(adj,0,2);
        put(adj,1,3);
        put(adj,2,3);
        put(adj,1,4);
        put(adj,4,5);
        // put(adj,5,6);
        DfS(adj, v, 0,visited);

    }
    public static void DfS(ArrayList<ArrayList<Integer>>adj,int v,int s,boolean[]visited){
         
        visited[s] = true;
        System.out.println(s);
        for( int e : adj.get(s)){
            if(visited[e] == false){
                DfS(adj, v, e,visited);
            }
           
        }
    }
    public static void put(ArrayList<ArrayList<Integer>>adj,int u, int v) {
        adj.get(v).add(u);
        adj.get(u).add(v);
    }
}
