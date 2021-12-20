package LInkedList;
class node{
	int data;
	node next;
	node(int x){
		data = x;
		next = null;
	}
}

public class search {

	public static void main(String[] args) {
		node head = new node(120);
		head.next = new node(4);
		head.next.next = new node(88);
		head.next.next.next=null;
		searching(head,88);
	}
public static int searching(node head,int y){
	node curr = head;
	int index = 0;
	while(curr != null) {
		if(curr.data == y ) {
		System.out.print(curr.data + " is at position " + index);
		return index;
		}
		else {
			index++;
		    curr = curr.next;
		}
	}
	return -1;
}		
}
