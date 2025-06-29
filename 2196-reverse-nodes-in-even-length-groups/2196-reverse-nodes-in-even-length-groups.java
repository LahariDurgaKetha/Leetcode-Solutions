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
    public void reverse_list(ArrayList<Integer> list,int si,int ei){
        while(si<=ei){
            int save = list.get(si);
            list.set(si,list.get(ei));
            list.set(ei,save);
            si++;
            ei--;
        }
    }
    public int find_size(ListNode head){
        if(head==null){
            return 0;
        }
        ListNode temp=head;
        int size=0;
        while(temp!=null){
            size++;
            temp=temp.next;
        }
        return size;
    }
    public ListNode reverseEvenLengthGroups(ListNode head) {
     if(head==null || head.next==null){
        return head;}//base case 1   
    if(head.next.next==null){
        return head;//base case 2
    }
    ArrayList<ArrayList<Integer>> mainlist = new ArrayList<>();
    ListNode temp=head;
    int i=0;
    int size=find_size(head);
    int listCnt=0;
    while(temp!=null){
        ArrayList<Integer> list = new ArrayList<>();
        listCnt++;
        i=listCnt;
        while(i-->0 && size-->0){
            list.add(temp.val);
            temp=temp.next;
        }
        //check before adding into mainlist
        if(list.size()%2==0){ //even length so reverse
            reverse_list(list,0,list.size()-1);
        }
        mainlist.add(list);
    }
    ListNode final_head=new ListNode(-1);
    ListNode new_head=final_head;
    for(ArrayList<Integer> sublist:mainlist){
        for(int el:sublist){
            ListNode node=new ListNode(el);
            new_head.next=node;
            new_head=new_head.next;
        }
    }
    return final_head.next;
}
}