package Collection;


import java.util.Deque;
import java.util.LinkedList;

public class DeQueue {

	public static void main(String[] args) {
		Deque<Integer> queue=new LinkedList<Integer>();
		queue.add(12);
		queue.add(13);
		queue.add(15);
		queue.add(67);
		queue.add(90);
		System.out.println(queue);
		queue.addFirst(99);
		queue.addLast(22);
		System.out.println(queue);
		queue.removeFirst();
		queue.removeLast();
		System.out.println(queue);

	}

}
