package linkedlist;

public class InsertAtAGivenPositionSLL {
	
	public static Node insertNode(Node head,int data,int pos) {
		Node node = new Node(data);
		int count = 1;
		if(head == null) {
			return node;
		}else if(pos == 1){
			node.next = head;
			return node;
		}else {
			Node curr = head;
			while(count <= pos ) {
				curr = curr.next;
				count++;
			}
			 Node rem = curr.next;
			 curr.next = node;
			 node.next = rem;
		}
		return head;
	}

}
