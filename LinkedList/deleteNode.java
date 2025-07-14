/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
        //copy next node's value,update link
    node.val=node.next.val;//This copies the value from the next node into the current node
    node.next=node.next.next;//this removes copied node form the list

    }
}
