package leetcode;

public class sorted_list_way_1 {
	public ListNode rotateRight(ListNode head, int k) {

		if (head == null || head.next == null) {
			return head;
		}
		ListNode n = head;
		int l = 1;
		while (n.next != null) {

			n = n.next;
			l++;

		}

		n.next = head;

		k = k % l;

		for (int i = 0; i < l - k; i++) {
			n = n.next;
		}

		ListNode new_head = n.next;
		n.next = null;
		return new_head;

	}
}
