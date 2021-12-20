package CircularLinkList;
class node{
	int data;
	node next;
	node(int x){
		data = x;
		next = null;
	}
}
public class DeleteFromBeginNdEnd {

	public static void main(String[] args) {
		node head = new node(11);
		head.next = new node(23);
		head.next.next = new node(87);
		head.next.next.next = new node(45);
		head.next.next.next.next = head;
		delete(head);
		print(head);
	}
	static void print(node head) {
		node curr = head;
		while(curr.next != head) {
			System.out.println(curr.data +" ");
			curr = curr.next;
}			
		}
	static node delete(node head) {
		node curr = head;
		while(curr.next !=head) {
			curr = curr.next;
		}
		curr.next = head;
		head = curr;
		return head;
		
	}
}
