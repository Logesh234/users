package Collection;
import java.util.LinkedList;
public class LinkedListExample1 {

	public static void main(String[] args) {
				LinkedList<Double>list=new LinkedList<Double>();
				list.add(3.4);
				list.add(2.3);
				list.add(4.5);
				list.add(1.3);
				list.add(9.0);
				System.out.println(list);
				list.addFirst(3.5);//previous node
				list.addLast(8.0);//last node
				System.out.println(list);
				list.set(2, 99.0);//update 2 nd position we do the update
				System.out.println(list);
				list.removeFirst();//first node removed
				list.removeLast();//last node removed
				System.out.println(list);
				list.add(5, 8.9);//5th position we crate one node
				System.out.println(list);

			}

		}


