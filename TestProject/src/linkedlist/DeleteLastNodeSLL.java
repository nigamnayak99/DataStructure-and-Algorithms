package linkedlist;

public class DeleteLastNodeSLL {

	public static Node deleteLastNode(Node head) {
		Node result = head;
		Node previous = null;
		if(head == null) {
			return null;
		}else {
			if(head.next != null) {
				while(head.next != null) {
					previous = head;
					head = head.next;
				}
				previous.next = null;
			}else {
				return null;
			}
		}
		return result;
	}
}
