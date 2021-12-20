import java.util.*;
public class Dijstra {

    public static void put(ArrayList<ArrayList<Integer>>adj,int v , int u , int mat[][],int distance ) {
        adj.get(v).add(u);
        adj.get(u).add(v);
        mat[v][u] = distance;
        mat[u][v] = distance;
    }

    public static void main(String[] args) {
        int v = 5;
        ArrayList<ArrayList<Integer>>adj = new ArrayList<>();
        PriorityQueue<Integer>pq = new PriorityQueue<>();
        for(int i =0; i< v ;i++){
            adj.add(new ArrayList<>());
        }
        int [][]mat = new int[v][v];
        int distance[] = new int[v];
        
        // boolean[] visited = new boolean[v];

        for(int i = 1; i< v;i++){
            distance[i] = Integer.MAX_VALUE;
        }
        distance[0] = 0;

        put(adj, 0, 1,mat, 4);
        put(adj, 0, 2,mat, 8);
        put(adj, 1, 2,mat, 2);
        put(adj, 1, 3,mat, 6);
        put(adj, 2, 3,mat, 3);
        put(adj, 2, 4,mat, 9);
        put(adj, 3, 4,mat, 5);
        

        for(int i = 0; i< v; i++){
            pq.add(distance[i]);
        }
        dij(pq, adj, distance, mat);


        for(int i = 0 ; i< v-1 ;i++){
            System.out.println(i + "-->" + i+1 + "=" + distance[i+1]);
        }




    }
    public static void dij(PriorityQueue<Integer>pq , ArrayList<ArrayList<Integer>>adj , int[]distance, int [][]mat) {
        while(!pq.isEmpty()){
            int u = pq.poll();
            for(int e: adj.get(u)){
                if(distance[e] > distance[u] + mat[e][u] && pq.contains(e)){
                    distance[e] = distance[u] + mat[e][u];
                }
            }
        }
    }


}
