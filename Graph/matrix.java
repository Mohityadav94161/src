import java.util.ArrayList;

public class matrix {
    
    public static void main(String[] args) {
        //matrix
        ArrayList<ArrayList<Integer>>adj = new ArrayList<>(5); 
        int v = 5;
        for(int i = 0 ;i< v ;i++){
            adj.add(new ArrayList<Integer>());
        }
        put(adj,0,1);
        put(adj,0,2);
        put(adj,1,2);
        put(adj,3,3);
        for(int i = 0; i< adj.size(); i++){
            System.out.print(i+"-->");
            for(int j = 0 ; j<adj.get(i).size();j++){
                System.out.print( adj.get(i).get(j)+ " ");
            }
            System.out.println();
        }


    }
    public static void put(ArrayList<ArrayList<Integer>>adj,int u, int v) {
        adj.get(v).add(u);
        adj.get(u).add(v);
    }
}
