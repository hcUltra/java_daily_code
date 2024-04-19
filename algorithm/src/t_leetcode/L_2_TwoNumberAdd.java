package t_leetcode;

/**
 * @author hcUltra
 * @description TODO
 * @date 2024/4/19 20:31
 **/
public class L_2_TwoNumberAdd {
    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    class Solution {
        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
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
    }
}
