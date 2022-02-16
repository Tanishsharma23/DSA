package leetcode;

public class swapping_nodes_in_a_linked_list {
	public ListNode swapNodes(ListNode head, int k) {

		ListNode n1 = new ListNode();
		n1 = head;
		for (int i = 1; i < k; i++) {
			n1 = n1.next;
		}

		ListNode node1 = new ListNode();
		node1 = n1;

		ListNode n2 = new ListNode();
		n2 = head;

		while (n1 != null && n1.next != null) {
			n2 = n2.next;
			n1 = n1.next;
		}

		int temp = node1.val;
		node1.val = n2.val;
		n2.val = temp;

		return head;

	}
}
