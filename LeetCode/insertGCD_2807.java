package LeetCode;

import java.util.ArrayList;

public class insertGCD_2807 {

  public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

class Solution {
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ArrayList<Integer> ls=new ArrayList<>();
        ListNode temp=head;
        while(temp!=null ){
            ls.add(temp.val);
            temp=temp.next;
        }
        int arr[]=new int[ls.size()-1];
        for(int i=0;i<ls.size()-1;i++){
            arr[i]=gcd(ls.get(i),ls.get(i+1));
        }
        ListNode rs=head;
        int indx=0;

        while(rs!=null && rs.next != null){
            ListNode newNode=new ListNode(arr[indx++]);
            newNode.next=rs.next;
            rs.next=newNode;
            rs=rs.next.next;
            
            
        }
        return head;
        
    }
    public static int gcd(int a,int b){
        if(b==0){
            return a;

        }
        return gcd(b,a%b);
    }
}
    
}
