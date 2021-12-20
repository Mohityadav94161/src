package Graph;
import java.util.Scanner;

public class MatrixRepresentation {
	public static void insert(int [][]m,int v,int u) {
		m[v][u] = 1;
		m[u][v] = 1;
		
	}

	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		int v = sc.nextInt();
		int [][]m = new int[v][v];
		insert(m , 0 , 1);
		insert(m , 0 , 2);
		insert(m , 0 , 5);
		insert(m , 1 , 3);
		insert(m , 1 , 4);
		insert(m , 2 , 3);
		insert(m , 2 , 7);
		insert(m , 4 , 7);
		insert(m , 5 , 6);
		insert(m , 6 , 7);
		print(m);
		

	}
	public static void print(int [][]m) {
		int n = m.length;
		for(int j = 0; j < n; j++) {
			System.out.print("    " + j );
		}
		System.out.println(" ");
		
		for(int i = 0; i < n; i++) {
			System.out.print(i + "-->");
			for(int j = 0; j < n; j++) {
				System.out.print(m[i][j] + "----");
			}
			System.out.println(" ");
		}
	}

}
//                 0--------1
//                /|       / \
//               / |      /   \
//              5--2-----3-----4
//              |  |          / 
//              |  |         /
//              |  |        / 
//              |  |       /
//              |  |      /    
//              |  |     / 
//              |  |    /
//              |  |   /
//              |  |  / 
//              6--7