package LInkedList;

class Node{
	int data;
	Node next;
	Node(int x){
		data = x;
		next = null;	
	}	
}

public class RecursiveMethodOfTraversing {

	public static void main(String[] args) {
		Node head = new Node(10);
		head.next = new Node(22);
		head.next.next = new Node(55);
		recrusive(head);
		

	}
public static void recrusive(Node head) {
	Node curr = head;
	if(curr == null) {
		return;
		
	}
	
	System.out.print(curr.data + " ");
		recrusive(curr.next);
			
		}
		
	}


