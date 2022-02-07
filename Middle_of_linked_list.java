package leetcode;

public class Middle_of_linked_list {
	public ListNode middleNode(ListNode head) {

		ListNode curr = head;

		int count = 0;

		while (curr != null) {
			count++;
			curr = curr.next;

		}
		count = count / 2;
		ListNode temp = head;

		for (int i = 0; i < count; i++) {
			temp = temp.next;
			if (i == count - 1) {
				return temp;
			}
		}

		return temp;

	}
}
