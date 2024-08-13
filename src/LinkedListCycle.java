public class LinkedListCycle {
    public static void main(String[] args) {
        // Создаем пример списка с циклом
        ListNode head = new ListNode(3);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(0);
        ListNode fourth = new ListNode(-4);

        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = second; // Создаем цикл (последний элемент указывает на второй)

        // Создаем объект класса Solution и проверяем наличие цикла
        Solution solution = new Solution();
        boolean result = solution.hasCycle(head);

        // Выводим результат
        if (result) {
            System.out.println("Список содержит цикл.");
        } else {
            System.out.println("Список не содержит цикл.");
        }
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}
class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next !=null){
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }
}
