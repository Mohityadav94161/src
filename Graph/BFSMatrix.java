import java.util.LinkedList;
import java.util.Queue;

public class BFSMatrix {
    public static void main(String[] args) {
       
        
        boolean  dest = false;
        // 
        int mat[][] =  {
            {3, 3, 3 ,3 ,0 ,0 ,3 ,0},
            {1 ,0 ,3 ,3 ,3 ,3 ,3 ,2},
            {3 ,3, 0, 3 ,0 ,3, 3, 3},
            {3 ,3 ,3 ,0 ,0, 3 ,3 ,0},
            {0 ,3 ,3 ,3 ,3 ,3, 3, 3},
            {0 ,0 ,0 ,3 ,3 ,0 ,3 ,3},
            {0 ,3, 0 ,3 ,3 ,3 ,3 ,0},
            {3 ,3 ,3 ,0 ,3 ,3 ,3 ,3}
       };
        boolean visited[][] = new boolean[mat.length][mat.length];
       int a = 0,b = 0;
       for(int i = 0 ; i< mat.length;i++){
        for(int j = 0 ; j< mat.length; j++){
            if(mat[i][j]==1){
                a = i;
                b = j;
                break;
            }
        }
       }
       System.out.println("index of source "+ a + " " + b);
        // for(int i = 0 ; i< mat.length ; i++){
                System.out.print("final answer is "+ BFS(mat, a,b, visited  ,dest));
            
        // }
        
        
        
    }


    public static void  put(int [][]mat , int v , int u ) {
        mat[v][u] = 1;
        mat[u][v] = 1;
    }

    public static boolean BFS(int[][]mat , int a ,int b,  boolean visited[][] , boolean dest){
        Queue<Integer>q = new LinkedList<>();
        q.add(a);
        visited[a][b] = true;
        while(!q.isEmpty()){
            int t = q.poll();
            System.out.println(" t is " +t+" ");
            for(int i = 0; i< mat.length; i++){
                // if(mat[t][i] == 0){
                //     break;
                // }
                if(mat[t][i]!= 0 && !visited[t][i]){
                    q.add(i);
                    visited[t][i] = true;
                    System.out.println("At index " + t + ","+ i+ "   and value is " + mat[t][i]);
                   
                   
                    if(mat[t][i] == 2){
                        dest = true;
                        System.out.println("Destination found  At index " + t + ","+ i+ "   and value is " + mat[t][i]);
                        return true;
                    }
                    mat[t][i] = 0;
                }
                
            }
        }
        
      
       
        return false;
       
        
        
    }
}