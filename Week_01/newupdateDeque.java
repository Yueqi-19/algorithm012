package debug.demo;

import java.util.Deque;
import java.util.LinkedList;

public class newupdateDeque {
    public static void main(String[] args) throws NullPointerException {
            Deque<String> deque = new LinkedList<String>();
            deque.addFirst("a");
            deque.addFirst("b");
            deque.addFirst("c");
            System.out.println(deque);

            String str = deque.peekFirst();
            System.out.println(str);
            System.out.println(deque);

            while (deque.size() > 0) {
                    System.out.println(deque.pollFirst());
                } System.out.println(deque);
    }

}
