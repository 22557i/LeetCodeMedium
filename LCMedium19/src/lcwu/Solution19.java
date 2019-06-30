package lcwu;

public class Solution19 {

		public ListNode removeNthFromEnd(ListNode head, int n) {
			ListNode dummyhead = new ListNode(0);
			dummyhead.next = head;
			ListNode curr =head;
			int i =0;
			while(curr!=null){
				i++;
				curr=curr.next;
			}
			i-=n;
			curr = dummyhead;
			while(i>0){
				i--;
				curr=curr.next;
			}
			curr.next=curr.next.next;
			return dummyhead.next;
	}
}
