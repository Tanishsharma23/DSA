package leetcode;

public class LL_cycle_2 {
	public ListNode detectCycle(ListNode head) {
		ListNode slow = new ListNode();
		ListNode fast = new ListNode();

		fast = head;
		slow = head;

		while (fast != null && fast.next != null) {

			fast = fast.next.next;
			slow = slow.next;

			if (fast == slow) {
				break;
			}
		}

		if (fast != null && fast.next != null) {
			fast = head;
			while (slow != fast) {
				fast = fast.next;
				slow = slow.next;
			}

			return fast;
		}
		return null;

	}
}
