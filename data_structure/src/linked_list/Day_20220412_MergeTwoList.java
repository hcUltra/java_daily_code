package linked_list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

/**
 * @author hcUltra
 * @description TODO
 * @date 2024/4/12 11:57
 **/
public class Day_20220412_MergeTwoList {
    public static class ListNode {
        int val;
        ListNode next;

        public ListNode(int val) {
            this.val = val;
        }
    }

    public static ListNode mergeTwoList(ListNode h1, ListNode h2) {
        if (h1 == null) {
            return h2;
        }

        if (h2 == null) {
            return h1;
        }

        ListNode dummy = new ListNode(-1);
        ListNode tail = dummy;

        while (h1 != null && h2 != null) {
            if (h1.val < h2.val) {
                tail = tail.next = h1;
                h1 = h1.next;
            } else {
                tail = tail.next = h2;
                h2 = h2.next;
            }
        }

        if (h1 != null) {
            tail = tail.next = h1;
        }

        if (h2 != null) {
            tail = tail.next = h2;
        }


        return dummy.next;
    }

    public static void main(String[] args) {
        ListNode h1 = sort(createLinkedList(5, 0, 5));
        printListNode(h1);

        ListNode h2 = sort(createLinkedList(5, 6, 10));
        printListNode(h2);

        ListNode head = mergeTwoList(h1, h2);
        printListNode(head);
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

    public static ListNode sort(ListNode head) {
        ArrayList<ListNode> list = new ArrayList<>();
        while (head != null) {
            list.add(head);
            head = head.next;
        }

        list.sort(Comparator.comparingInt(a -> a.val));
        for (int i = 0; i < list.size() - 1; i++) {
            list.get(i).next = list.get(i + 1);
        }
        list.get(list.size() - 1).next = null;
        return list.get(0);
    }
}
