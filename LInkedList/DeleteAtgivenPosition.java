package LInkedList;
class node{
	int data;
	node next;
	node(int x){
		data = x;
		next = null;
	}
}

public class DeleteAtgivenPosition {

	public static void main(String[] args) {
		node head = new node(22);
		head.next = new node(88);
		head.next.next= new node(34);
		head.next.next.next = new node(76);
		deleteAtGivenIndex(head,3);
		print(head);
	}
	public static node deleteAtGivenIndex(node head,int pos) {
		int index = 1;
		node curr= head;
		if(pos==1) {
			head = head.next;
			return head;
		}
		else {
			while(index !=pos-1) {
			curr = curr.next;
			index++;
		}
		curr.next = curr.next.next;
		
		}
		return head;
	}
	static void print(node head) {
		node curr = head;
		while(curr != null) {
			System.out.println(curr.data +" ");
			curr = curr.next;
   }
 }
}