package queues;
import java.util.*;
public class Queues {
 public static void main(String[] args) {
 Queue<Integer> queue = new ArrayDeque<>();
 queue.add(10);
 queue.add(20);
 queue.add(30);
 System.out.println(queue);
 //[10, 20, 30]
 var front = queue.remove();
 System.out.println("peek --> " + queue.peek());
 System.out.println(front);
 //10
 System.out.println(queue);
 //[20, 30]
 queue.add(30);
 queue.add(40);
// queue.add(50);
// queue.add(30);
// queue.add(40);
// queue.add(50);
// queue.add(30);
// queue.add(40);
// queue.add(50);
 System.out.println(queue);
 System.out.println(queue.remove());
 System.out.println(queue);
 System.out.println(queue.remove());
 System.out.println(queue);
 System.out.println(queue.remove());
 System.out.println(queue);
 System.out.println(queue.remove());
 System.out.println(queue);
 //System.out.println(queue.remove());
 
 }
}