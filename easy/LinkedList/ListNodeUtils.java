package easy.LinkedList;

public class ListNodeUtils {

    public static void printList(ListNode head) {
        while (head != null) {
            if (head.next != null)
                System.out.print(head.val + " -> ");
            head = head.next;
        }
    }
}
