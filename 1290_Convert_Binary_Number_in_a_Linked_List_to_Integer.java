/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int getDecimalValue(ListNode head) {
        ListNode temp=head;
        String str="";
        while(temp!=null)
        {
            str+=temp.val;
            temp=temp.next;
        }
        int res=0;
        int c=0;
        for(int x=str.length()-1;x>=0;x--)
        {
            res+=(Math.pow(2,c)*(str.charAt(x)-'0'));
            c++;
        }
        System.out.println(str);
        return res;
        
    }
}
