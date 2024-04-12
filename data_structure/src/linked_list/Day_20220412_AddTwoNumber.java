package linked_list;

import java.util.Random;

/**
 * @author hcUltra
 * @description TODO
 * @date 2024/4/12 12:21
 **/
public class Day_20220412_AddTwoNumber {
    public static class ListNode {
        int val;
        ListNode next;

        public ListNode(int val) {
            this.val = val;
        }
    }

    public static ListNode add(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(1);
        ListNode tail = dummy;

        ListNode h1 = l1;
        ListNode h2 = l2;
        int t = 0;// 进位
        while (t != 0 || h1 != null || h2 != null) {
            if (h1 != null) {
                t += h1.val;
                h1 = h1.next;
            }
            if (h2 != null) {
                t += h2.val;
                h2 = h2.next;
            }

            tail = tail.next = new ListNode(t % 10);
            t /= 10;
        }

        return dummy.next;
    }


    public static void main(String[] args) {
        ListNode l1 = createLinkedList((int) (Math.random() * 3 + 1), 0, 9);
        printListNode(l1);
        ListNode l2 = createLinkedList((int) (Math.random() * 3 + 1), 0, 9);
        printListNode(l2);

        printListNode(add(l1, l2));

    }

    public static ListNode createLinkedList(int length, int minValue, int maxValue) {
        Random rand = new Random();
        ListNode head = new ListNode(-1);
        ListNode current = head;

        for (int i = 0; i < length; i++) {
            int value = rand.nextInt((maxValue - minValue) + 1) + minValue;
            current.next = new ListNode(value);
            current = current.next;
        }

        return head.next;
    }

    public static void printListNode(ListNode head) {
        ListNode cur = head;
        while (cur != null) {
            if (cur.next != null) {
                System.out.print(cur.val + "->");
            } else {
                System.out.print(cur.val + "->null");
            }
            cur = cur.next;
        }
        System.out.println();
    }
}
