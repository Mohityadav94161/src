import java.util.*;
public class island {
    public static void main(String[] args) {
        int grid[][] = {{1, 1, 0, 0, 0},

        {0, 1, 0, 0, 1},

        {1, 0, 0, 1, 1},

        {0, 0, 0, 0, 0},

        {1, 0, 1, 0, 1} };

        // boolean[] visited= new boolean[grid.length];
        System.out.print( numIslands(grid));



        
    }
    public static void bfs(int[][] grid , int s , boolean []visited ){
        Queue<Integer>q= new LinkedList<>();
        q.add(s);
        visited[s] = true;
        while(!q.isEmpty()){
            int t = q.poll();
            System.out.print(t + " ");
            for(int i = 0 ; i< grid.length ; i++){
                if(grid[t][i] == 1 && !visited[i]){
                    q.add(i);
                    visited[i] = true;
                    // grid[t][i] = 0;
                }
            }
        }
    }
    public static int numIslands(int[][] grid)
    {
        boolean visited[] = new boolean[grid.length];
        int count = 0 ;
        for(int i = 0 ;i < grid.length ; i++){
            if(!visited[i]){
                count++;
                System.out.println("not vidited " + i);
                bfs(grid , i , visited);
            }
            
            
        }
        return count;
    }
}
