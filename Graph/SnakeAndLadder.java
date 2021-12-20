import java.util.*;
public class SnakeAndLadder {
    public static void main(String[] args) {
        int N =  2;
        int []arr = {12, 18, 3, 19};
        minThrow(N, arr);
    }
    static int minThrow(int N, int arr[]){
        boolean vis[] = new boolean[31];
        Queue<Integer>q = new LinkedList<>();
        HashMap<Integer , Integer>hm = new HashMap<>();
        int count = 1 ;
        for(int i = 0 ; i< N*2-1 ;i+=2){
            System.out.println(" key " + arr[i] + " value  "+ arr[i+1]);
            hm.put(arr[i] ,arr[i+1]);
        }
        q.add(1);
        System.out.println("Add first "+1);
        while(!q.isEmpty()){
            int size = q.size();
            while(size-->0){
                int a = q.poll();
                if(a==30){
                    return count;
                }
                vis[a] = true;
                System.out.println("poping from q "+ a);
                for(int i = 1 ; i< 7 ; i++){
                    
                    if(a+i<=30 && !vis[a+i]){
                        if(a+i == 30){
                            vis[a+i] = true;
                            System.out.println("found i count "+ count );
                            return count;
                        }
                        if(hm.containsKey(a+i)){
                            
                            System.out.println("adding ladder "+hm.get(a+i));
                            vis[hm.get(a+i)] = true;
                            q.add(hm.get(a+i));
                        }
                        else{
                            vis[a+i] = true;
                            System.out.println(" adding " + (a+i));
                            q.add(a+i);
                        }
                        
                    }
    
                }
            }
            System.out.println("count " + count);
            count++;
        }
        return count;
        
        
        
    }
}
