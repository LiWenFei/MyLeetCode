package AddTwoNumbers_2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * 输入：(2 -> 4 -> 3) + (5 -> 6 -> 4) 输出：7 -> 0 -> 8 原因：342 + 465 = 807
 * 
 * @author wenfei1
 *
 */
public class Main {
	public static void main(String[] args) {
		ListNode l1 = new ListNode(2);
		l1.next = new ListNode(4);
		l1.next.next = new ListNode(3);

		ListNode l2 = new ListNode(5);
		l2.next = new ListNode(6);
		l2.next.next = new ListNode(4);

		ListNode result = Solution.addTwoNumbers(l1, l2);
		System.out.println("[" + result.val + "," + result.next.val + "," + result.next.next.val + "]");

	}
}
