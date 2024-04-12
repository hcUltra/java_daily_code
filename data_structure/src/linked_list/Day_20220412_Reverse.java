package linked_list;

import java.util.Random;

/**
 * @author hcUltra
 * @description TODO
 * @date 2024/4/12 10:57
 **/
public class Day_20220412_Reverse {
    public static class ListNode {
        int val;
        ListNode next;
        public ListNode(int val) {
            this.val = val;
        }
    }

    public static class DoubleListNode {
        int val;
        DoubleListNode next;
        DoubleListNode prev;

        public DoubleListNode(int val) {
            this.val = val;
        }
    }

    public static ListNode reverse(ListNode head) {
        ListNode prev = null;
        ListNode next = null;
        while (head != null) {
            next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
    }

    public static DoubleListNode reverse(DoubleListNode head) {
        DoubleListNode prev = null;
        DoubleListNode next = null;
        while (head != null) {
            next = head.next;
            head.next = prev;
            head.prev = next;
            prev = head;
            head = next;
        }
        return prev;
    }

    public static void main(String[] args) {
        System.out.println("reverse single list");
        ListNode head = createLinkedList(10, 0, 5);
        printListNode(head);
        System.out.println();
        printListNode(reverse(head));
        System.out.println();
        System.out.println("reverse double list");
        DoubleListNode doubleHead = createDoubleLinkedList(10, 0, 5);
        printDoubleListNode(doubleHead);
        System.out.println();
        printDoubleListNode(reverse(doubleHead));

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
    }

    public static void printDoubleListNode(DoubleListNode head) {
        DoubleListNode cur = head;
        while (cur != null) {
            if (cur.next != null) {
                System.out.print(cur.val + "<->");
            } else {
                System.out.print(cur.val + "<->null");
            }
            cur = cur.next;
        }
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

        return head.next; // 返回头节点（head.next）以忽略初始空节点
    }


    public static DoubleListNode createDoubleLinkedList(int length, int minValue, int maxValue) {
        Random rand = new Random();
        DoubleListNode head = new DoubleListNode(-1); // 辅助头节点，便于操作
        DoubleListNode tail = new DoubleListNode(-1); // 辅助尾节点，便于操作
        head.next = tail; // 将头节点与尾节点连接起来
        tail.prev = head;

        DoubleListNode current = head;
        for (int i = 0; i < length; i++) {
            int value = rand.nextInt((maxValue - minValue) + 1) + minValue;
            DoubleListNode newNode = new DoubleListNode(value);
            newNode.prev = current;
            newNode.next = current.next;
            current.next.prev = newNode;
            current.next = newNode;
            current = newNode;
        }

        return head.next; // 返回头节点（head.next）以忽略初始空节点
    }


}
