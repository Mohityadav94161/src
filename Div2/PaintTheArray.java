
import java.util.*;
public class PaintTheArray {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int t = sc.nextInt();
            while(t-->0){
                int n = sc.nextInt();
                int arr[] = new int[n];
                boolean check = false;
                for(int i = 0 ; i< n ; i++){
                    arr[i] = sc.nextInt();
                    if(i>0 && arr[i]==arr[i-1])check = true;
                }
                if(check == true){
                    System.out.println("no");
                    continue;
                }
                boolean check2 = false;
                for(int i = 0 ; i< n ; i++){
                    check2 = false;
                    for(int j = 0 ; j<n-1; j++){
                        if(arr[j]%i == 0 && arr[j+1]%i == 0){
                            check2 = true;
                            break;
                        }
                    }
                    if(check2 == false){
                        System.out.println(i);
                        break;
                    }
                }
            }
        }
    }
}
