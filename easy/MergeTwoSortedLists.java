package easy;

//You are given the heads of two sorted linked lists lit1 and list2.
//Merge the two lists into one sorted list. The list should be made by splicing together the nodes of the first two lists.s
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class MergeTwoSortedLists {

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(0);
        ListNode ans = dummy;
        while ( list1 != null && list2 != null ){
           if ( list1.val < list2.val ){
               dummy.next = list1;
               list1 = list1.next;
           } else {
               dummy.next = list2;
               list2 = list2.next;
           }
            dummy = dummy.next;
        }

        if ( list1 != null ) dummy.next = list1;
        if ( list2 != null ) dummy.next = list2;

        return ans.next;
    }

    public static void main(String[] args) {
//        list1 = [1,2,4], list2 = [1,3,4]
        ListNode list1 = new ListNode(1, new ListNode(2, new ListNode(4)));
        ListNode list2 = new ListNode(1, new ListNode(3, new ListNode(4)));
        printList(mergeTwoLists(list1, list2));
    }

    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " -> ");
            head = head.next;
        }
    }

}
