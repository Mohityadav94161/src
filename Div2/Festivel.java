package Div2;
import java.util.*;
public class Festivel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int g=0;
        while(g++ <t){

        }
    }
    class pair{
        int i,j;
        public pair(int i , int j){
            this.i = i ;
            this.j = j;
        }
    }
        public  void sortb(int arr[][], int col)
        {

            Arrays.sort(arr, new Comparator<int[]>() {

              // @Override              

              public int compare(final int[] entry1, 
                                 final int[] entry2) {

                if (entry1[col] > entry2[col])
                    return 1;
                else
                    return -1;
              }
            });
        }
    
        
}

