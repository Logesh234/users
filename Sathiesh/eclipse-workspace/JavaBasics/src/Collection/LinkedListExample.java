package Collection;
import java.util.LinkedList;
public class LinkedListExample {
	
		public static void main(String[] args) {
			LinkedList <Double>list=new LinkedList <Double>();
			list.add(3.4);
			list.add(2.3);
			list.add(4.5);
			list.add(1.3);
			list.add(9.0);
			System.out.println(list);
			list.addFirst(3.5);
			list.addLast(8.0);
			System.out.println(list);
			list.set(2, 99.0);
			System.out.println(list);
			list.removeFirst();
			list.removeLast();
			System.out.println(list);

		}

	}

