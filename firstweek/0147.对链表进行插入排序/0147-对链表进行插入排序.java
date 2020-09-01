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
        ListNode pre=head,cur=head.next;           //ʹ��ǰ���ڵ�pre���ں����ڵ��ɾ������
        ListNode dummy=new ListNode(0);         //����һ��ͷ��㣬��������Ĳ���
        dummy.next=head;
        while (cur!=null){
            if (pre.val<cur.val){                   //ǰ��ڵ��Ѿ�������������
                pre=cur;
                cur=cur.next;
            }
            else {
                ListNode p=dummy;
                while (p.next!=cur &&p.next.val<cur.val)
                    p=p.next;
                pre.next=cur.next;         //ɾ����ǰ�ڵ�
                cur.next=p.next;          //����ǰ�ڵ����ӵ���Ӧλ��
                p.next=cur;
                cur=pre.next;
            }
        }
        return dummy.next;
    }

}

