import java.util.*;
public class coinPiles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long t = sc.nextLong();
        while(t-->0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            if((a+b) %3 ==0 && Math.min(a, b)*2>=Math.max(a, b)){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
        
    }
}

