import java.util.ArrayList;

public class loopDetectioninUnDire {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>>adj = new ArrayList<>();
        int v = 7;
        for(int i = 0 ;i< v ;i++){
            adj.add(new ArrayList<Integer>());
        }
        put(adj,0,1);
        put(adj,0,4);
        put(adj,1,2);
        put(adj,2,3);
        put(adj,4,5);
        put(adj,4,6);
        put(adj,5,6);

      
        boolean[] visited = new boolean[v];
        System.out.print(cycle(adj, 0, v, -1, visited));


        

    }
    public static void put(ArrayList<ArrayList<Integer>>adj,int u,int v) {
        adj.get(u).add(v);
        adj.get(v).add(u);
    }
    public static boolean cycle(ArrayList<ArrayList<Integer>>adj,int s,int v,int parent,boolean[] visited) {
       
        visited[s] = true;
        for(int e: adj.get(s)){
            if(e != parent && visited[e]){
                return true;
            }
            else if(!visited[e]){

                 if(cycle(adj, e, v, s, visited)){
                     return true;
                 }
            }
            
        }
        return false;
  
    }
}
