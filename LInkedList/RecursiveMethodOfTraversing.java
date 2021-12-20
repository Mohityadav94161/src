package LInkedList;
class node{
	int data;
	node next;
	node(int x){
		data = x;
		next = null;	
	}	
}

public class RecursiveMethodOfTraversing {

	public static void main(String[] args) {
		node head = new node(10);
		head.next = new node(22);
		head.next.next = new node(55);
		recrusive(head);
		

	}
public static void recrusive(node head) {
	node curr = head;
	if(curr == null) {
		return;
		
	}
	
	System.out.print(curr.data + " ");
		recrusive(curr.next);
			
		}
		
	}


