package arrayes;
import java.util.*;
public class MaxInKsubarray {
    public static void main(String[] args) {
        int n = 9, k = 3;
        int arr[] = {1, 2, 3, 1 ,4, 5, 2, 3, 6};
        System.out.println( Solution.max_of_subarrays(arr, n, k));
    }
}
class Solution {
    static ArrayList<Integer> max_of_subarrays(int arr[], int n, int k) {
        ArrayList<Integer>ar = new ArrayList<>();
        PriorityQueue<Integer>pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i = 0 ; i<Math.min(k,n) ; i++){
            pq.add(arr[i]);
        }
        for(int i = k ; i < n; i++){
            ar.add(pq.peek());
            pq.remove(arr[i-k]);
            pq.add(arr[i]);
        }
        ar.add(pq.peek());
        return ar;
    }
}
