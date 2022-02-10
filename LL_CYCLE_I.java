package leetcode;

public class LL_CYCLE_I {
	public boolean hasCycle(ListNode head) {

//       HashMap<ListNode , Integer>map = new HashMap<>();  //Way 1 T.C. -> O(N)
//                                                                   //S.C. -> O(N)
//       ListNode dummy = new ListNode();
//       dummy = head;
//       while(dummy != null){

//           if(map.containsKey(dummy)){
//               return true;
//           }
//           else{
//               map.put(dummy , 1);
//           }
//           dummy = dummy.next;

//       }

//       return false;
		// if(pos<0){return false;}

		ListNode slow = new ListNode();
		ListNode fast = new ListNode();

		fast = head;
		slow = head;

		while (fast != null && fast.next != null) {

			fast = fast.next.next;
			slow = slow.next;

			if (fast == slow) {
				return true;
			}

		}
		return false;

	}
}
