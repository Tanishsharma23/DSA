package leetcode;

class Node {
	int val;
	Node next;
	Node random;

	public Node(int val) {
		this.val = val;
		this.next = null;
		this.random = null;
	}
}

public class copy_linked_list_with_random_pointer {
	public Node copyRandomList(Node head) {
		if (head == null) {
			return head;
		}
		Node curr = head;

		while (curr != null) { // update linking of node.next

			Node temp = curr.next;

			curr.next = new Node(curr.val);

			curr.next.next = temp;
			curr = temp;

		}

		curr = head;

		while (curr != null) { // set random for new list
			if (curr.random != null) {
				curr.next.random = curr.random.next;
			}
			curr = curr.next.next;

		}

		Node ll = head;
		Node copy_ll = head.next;
		Node copy_ll_head = copy_ll;
		while (ll != null && copy_ll != null) { // new linking of ll and copy of ll
			ll.next = ll.next.next;
			ll = ll.next;
			copy_ll.next = (copy_ll.next != null) ? copy_ll.next.next : copy_ll.next;
			copy_ll = copy_ll.next;
		}
		return copy_ll_head;

	}
}
