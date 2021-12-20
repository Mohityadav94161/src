package binaryTree;

public class LeftView {

	public static void main(String[] args) {
		 node root        =  new node(76);
		 root.left        =  new node(6);
		 root.right       =  new node(176);
		 root.left.left   =  new node(276);
		 root.right.right =  new node(16);
		 root.right.left  =  new node(761);
		 root.left.right  =  new node(72);
		printl(root,1);

	}
	static int  maxlevel = 0;
	public static void printl(node root,int level) {
		
		if(root == null) {
			return;
		}
		if(maxlevel <level) {
			System.out.print(root.key +" ");
			maxlevel = level;
		}
		printl(root.right,level+1);
		printl(root.left,level+1);
		
	}

}
