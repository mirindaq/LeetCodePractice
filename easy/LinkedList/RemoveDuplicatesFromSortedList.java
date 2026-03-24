package easy.LinkedList;

public class RemoveDuplicatesFromSortedList {

    public static  ListNode deleteDuplicates(ListNode head) {
        ListNode ans = head;
        while ( head != null && head.next != null ){
            if ( head.val == head.next.val ){
                head.next = head.next.next;
            } else {
                head = head.next;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
//        Input: head = [1,1,2,3,3]
//        Output: [1,2,3]

        ListNode head = new ListNode(1,
                new ListNode(1,
                        new ListNode(2,
                                new ListNode(3,
                                        new ListNode(3)
                                )
                        )
                )
        );

        ListNodeUtils.printList(deleteDuplicates(head));

    }
}
