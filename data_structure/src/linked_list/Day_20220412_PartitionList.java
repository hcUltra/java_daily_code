package linked_list;

import java.util.Random;

/**
 * @author hcUltra
 * @description TODO
 * @date 2024/4/12 12:32
 **/
public class Day_20220412_PartitionList {
    public static class ListNode {
        int val;
        ListNode next;

        public ListNode(int val) {
            this.val = val;
        }
    }

    // 分隔链表
    public static ListNode partition(ListNode head, int target) {
        ListNode l = new ListNode(-1);
        ListNode tl = l;

        ListNode r = new ListNode(-1);
        ListNode tr = r;

        while (head != null) {
            if (head.val < target) {
                tl = tl.next = head;
            } else {
                tr = tr.next = head;
            }
            head = head.next;
        }

        // 跳过虚拟头结点
        tl.next = r.next;
        tr.next = null;

        return l.next;
    }

    public static void main(String[] args) {
        ListNode listNode = createLinkedList(5, 0, 10);
        printListNode(listNode);
        printListNode(partition(listNode, 5));
    }

    public static ListNode createLinkedList(int length, int minValue, int maxValue) {
        Random rand = new Random();
        ListNode head = new ListNode(-1);
        ListNode current = head;

        for (int i = 0; i < length; i++) {
            int value = rand.nextInt((maxValue - minValue) + 1) + minValue;
            System.out.println(value);
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
