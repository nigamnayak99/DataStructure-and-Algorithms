package linkedlist;

public class DeleteFirstNodeSLL {

	public static Node deleteFirstNode(Node head) {
		if(head == null) { // if null linked list is given as input
			return head;
		}else {
			head = head.next;
		}
		return head;
	}
}
