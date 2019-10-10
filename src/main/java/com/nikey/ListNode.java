package com.nikey;

public class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}
class Solution {



    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        return null;
    }

    public static void main(String[] args) {
        ListNode node1 = new ListNode(2);
        ListNode nodeNext1 = new ListNode(4);
        node1.next = nodeNext1;
        ListNode nodeNext2 = new ListNode(3);
        nodeNext1.next = nodeNext2;
        ListNode node2 = new ListNode(5);
        ListNode nodeNext3 = new ListNode(6);
        node2.next = nodeNext3;
        ListNode nodeNext4 = new ListNode(4);
        nodeNext3.next = nodeNext4;



        Solution solution = new Solution();
        ListNode listNode = solution.addTwoNumbers(node1,node2);

        ListNode n = listNode;
        while (1==1){
            if (n.next != null){
                System.out.println("val："+n.val);
                n = n.next;
            }else{
                System.out.println("val："+n.val);
                return;
            }
        }
    }
}
