package LInkedList;
//public class node{
//	int data;
//	node next;
//	node(int x){
//		data = x;
//		next = null;
//				
//	}
//}

public class INsertAtGivenIndex {

	public static void main(String[] args) {
		node head = new node(22);
		head.next = new node(88);
		head.next.next= new node(34);
		head.next.next.next = new node(76);
		insertAt(head,1,35);
		print(head);
	}
	public static node insertAt(node head,int pos,int y) {
		node temp =new node(y);
		node curr = head;
		int index = 1;
		if(pos == 1) {
			temp.next = head;
			head = temp;
			return head;
		}
		else {
		while(index != pos-1) {
			curr = curr.next;
			index ++;
		}
		temp.next = curr.next;
		curr.next =temp;
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
