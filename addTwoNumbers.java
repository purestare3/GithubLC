import java.util.Stack;
import java.util.Scanner;
public class addTwoNumbers {
	public static ListNode addTwoNumbers(ListNode l1, ListNode l2){
	ListNode dummyHead = new ListNode(0);
    ListNode p = l1, q = l2, curr = dummyHead;
    int carry = 0;
    while (p != null || q != null) {
        int x = (p != null) ? p.val : 0;
        int y = (q != null) ? q.val : 0;
        int sum = carry + x + y;
        carry = sum / 10;
        curr.next = new ListNode(sum % 10);
        curr = curr.next;
        if (p != null) p = p.next;
        if (q != null) q = q.next;
    }
    if (carry > 0) {
        curr.next = new ListNode(carry);
    }
    return dummyHead.next;
}
	public static void main(String args[]){
		ListNode l1 = new ListNode(2);
		l1.next = new ListNode(4);
		l1.next.next = new ListNode(3);
		
		ListNode l2 = new ListNode(5);
		l2.next = new ListNode(6);
		l2.next.next = new ListNode(4);
		
	   ListNode l3 = addTwoNumbers(l1, l2);	
	   ListNode l4 = l3;
	   for (int i=0;i<3;i++){
		   System.out.println(l4.val);
		   l4 = l4.next;
	   }
	}
	}
