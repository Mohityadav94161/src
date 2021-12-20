import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class ShortestPath {
    public static void main(String[] args) {
        int v = 6;
        ArrayList<ArrayList<Integer>>adj = new ArrayList<>();
        for(int i = 0 ; i< v;i++){
            adj.add(new ArrayList<>());
        }
        int[]deg = new int[v];
        int [][]w = new int[v][v];
        putwe(w,adj, 0, 1, 2 ,deg);
        putwe(w,adj, 1, 2, 3 ,deg);
        putwe(w,adj, 2, 3, 6 ,deg);
        putwe(w,adj, 0, 4, 1 ,deg);
        putwe(w,adj, 4, 2, 2 ,deg);
        putwe(w,adj, 4, 5, 4 ,deg);
        putwe(w,adj, 5, 3, 1, deg);
        int[]dist = new int[v];
        for(int i = 0; i< v;i++){
            dist[i] = Integer.MAX_VALUE;
        }
        dist[0] = 0;   
        Queue<Integer>q = new LinkedList<>();
        int []topo = new int[v];
        int tr[] = new int [v];
        for(int i = 0; i< v;i++){
            tr[i] = i;
        }


        topologicalSort(adj, q, deg, topo);
        for(int e: tr){
            for(int p:adj.get(e)){
                if(dist[p]>dist[e]+w[e][p]){
                    dist[p] = dist[e]+w[e][p];
                }
            }
        }
        for(int e:dist){
            System.out.print(e + " ");
        }

    }
    public static void putwe(int w[][],ArrayList<ArrayList<Integer>>adj,int u,int v,int weight,int[]deg){
        adj.get(u).add(v);
        w[u][v] = weight;
        deg[v]++;

    }
    public static void topologicalSort(ArrayList<ArrayList<Integer>>adj,Queue<Integer>q,int[]deg,int[]topo) {
        for(int i = 0 ;i < deg.length; i++){
            if(deg[i]==0){
                q.add(i);
            }
        }
        int index = 0;
        while(!q.isEmpty()){
            int u = q.poll();
            topo[index] = u;
            index++;
            for(int e :adj.get(u)){
                deg[e] = deg[e]-1;               
                if(deg[e]==0){
                    q.add(e);
                }
            }
        }
    
    }
}
