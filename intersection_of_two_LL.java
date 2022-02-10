package leetcode;
import java.util.*;
public class intersection_of_two_LL {
	public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
		ListNode dummy_A = new ListNode();
		// ListNode dummy_B = new ListNode();
		// way 1 n*m
		dummy_A = headA;

//	         while(dummy_A != null){

//	             dummy_B = headB;

//	             while(dummy_B != null){

//	                 if(dummy_A == dummy_B){
//	                     return dummy_A;
//	                 }
//	                 dummy_B =dummy_B.next;
//	             }
//	             dummy_A = dummy_A.next;
//	         }
//	         return null;

		Stack<ListNode> s1 = new Stack<>(); // Way 2 = n+m
		Stack<ListNode> s2 = new Stack<>();

		while (dummy_A != null) {
			s1.push(dummy_A);
			dummy_A = dummy_A.next;
		}
		dummy_A = headB;
		while (dummy_A != null) {
			s2.push(dummy_A);
			dummy_A = dummy_A.next;
		}
		dummy_A = null;
		while (!s1.isEmpty() && !s2.isEmpty() && (s1.peek() == s2.peek())) {
			dummy_A = s1.pop();
			s2.pop();
		}
		return dummy_A;

	}
}
