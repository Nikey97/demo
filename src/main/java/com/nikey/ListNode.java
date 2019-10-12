package com.nikey;

public class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}
class Solution {

    private long getListNodeByStr(ListNode node){
        ListNode n = node;
        StringBuffer buffer = new StringBuffer();
        while (1==1){
            if (n.next != null){
                buffer.append(n.val);
                n = n.next;
            }else{
                buffer.append(n.val);
                break;
            }
        }
        return Long.parseLong(buffer.reverse().toString());
    }

    private ListNode getInstance(int val){
        return new ListNode(val);
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        long node1 = this.getListNodeByStr(l1);
        long node2 = this.getListNodeByStr(l2);
        String added = (node1 + node2)+"";
        ListNode pre = null;
        ListNode head = null;
        for (int i = 0; i < added.length(); i++) {
            ListNode node = this.getInstance(Integer.parseInt(added.charAt((added.length()-i)-1)+""));
            if (i >= 1){
                if (i == 1){
                    head.next = node;
                    pre = node;
                }else{
                    pre.next = node;
                    pre = node;
                }
            }else{
                head = node;
            }
        }
        return head;
    }

    public static void main(String[] args) {
        ListNode node1 = new ListNode(9);
        ListNode nodeNext1 = new ListNode(4);
        node1.next = nodeNext1;
        ListNode nodeNext2 = new ListNode(3);
        nodeNext1.next = nodeNext2;
        ListNode node2 = new ListNode(1);
        ListNode nodeNext3 = new ListNode(9);
        node2.next = nodeNext3;
        ListNode nodeNext4 = new ListNode(9);
        nodeNext3.next = nodeNext4;

        Solution solution = new Solution();
        ListNode listNode = solution.addTwoNumbers(node1,node2);

//        System.out.println(solution.getListNodeByStr(node1));
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
