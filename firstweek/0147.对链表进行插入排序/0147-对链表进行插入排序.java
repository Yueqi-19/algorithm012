/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
// class Solution {
//     public ListNode insertionSortList(ListNode head) {
//         List<Integer> list = new ArrayList<>();
//         ListNode p = head;
//         while (p != null){
//             list.add(p.val);
//             p=p.next;
//         }
//         Collections.sort(list);
//         p=head;
//         int i =0;
//         while (p !=null){
//             p.val = list.get(i++);
//             p=p.next;
//         }
//         return head;


//     }
// }
class Solution {
   public ListNode insertionSortList(ListNode head) {
        if (head==null ||head.next==null)
            return head;
        ListNode pre=head,cur=head.next;           //使用前驱节点pre便于后续节点的删除操作
        ListNode dummy=new ListNode(0);         //建立一个头结点，便于链表的插入
        dummy.next=head;
        while (cur!=null){
            if (pre.val<cur.val){                   //前后节点已经有序，无需重排
                pre=cur;
                cur=cur.next;
            }
            else {
                ListNode p=dummy;
                while (p.next!=cur &&p.next.val<cur.val)
                    p=p.next;
                pre.next=cur.next;         //删除当前节点
                cur.next=p.next;          //将当前节点连接到对应位置
                p.next=cur;
                cur=pre.next;
            }
        }
        return dummy.next;
    }

}

