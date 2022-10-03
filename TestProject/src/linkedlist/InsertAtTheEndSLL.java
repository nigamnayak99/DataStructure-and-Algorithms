package linkedlist;

public class InsertAtTheEndSLL {

	public Node insertAtTheEnd(Node head,int element) {
		Node prevHead= head;
		if(head == null) {
			head = new Node(element);
			return head;
		}
		while(head.next != null) {
			head = head.next;
		}
		Node newNode = new Node(element);
		head.next = newNode;
		return prevHead;
	}
}
