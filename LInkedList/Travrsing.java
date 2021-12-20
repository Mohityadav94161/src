package LInkedList;
class Node{
	int data;
	 Node next;
	 Node(int x){
		 data = x;
		 next = null;
	 }
}
public class Travrsing {

	public static void main(String[] args) {
		Node Head = new Node(10);
		Node temp1 = new Node(20);
		Node temp2 = new Node(32);
		
		Head.next = temp1;
		temp1.next = temp2;
		temp2.next= null;
		print(Head);
		
	}


 static void print(Node Head) {
	Node curr = Head;
	while(curr != null) {
		System.out.println(curr.data +" ");
		curr = curr.next;
	}
	
}
}