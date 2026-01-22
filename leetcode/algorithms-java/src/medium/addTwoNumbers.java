package medium;

public class addTwoNumbers {
    public ListNode Solution(ListNode l1, ListNode l2) {
        int carryOver = 0;
        ListNode head = new ListNode(0);
        ListNode currentNode = head;

        while (l1 != null || l2 != null) {
            int x = (l1 != null) ? l1.val : 0;
            int y = (l2 != null) ? l2.val : 0;
            int sum = x + y + carryOver;
            carryOver = sum / 10;

            currentNode.next = new ListNode(sum % 10);
            currentNode = currentNode.next;

            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }

        if (carryOver > 0) {
            currentNode.next = new ListNode(carryOver);
        }
        return head.next;
    }
}
