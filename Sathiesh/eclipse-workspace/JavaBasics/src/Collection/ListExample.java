package Collection;

	import java.util.ArrayList;

	public class ListExample {

		public static void main(String[] args) {
			ArrayList <Integer>list=new ArrayList<Integer>();
			list.add(12);
			list.add(13);
			list.add(14);
			list.add(12);
			list.add(16);
			list.add(18);
			System.out.println(list);
			ArrayList <Float>list1=new ArrayList<Float>();
			list1.add(12.5f);
			list1.add(13.7f);
			list1.add(14.8f);
			list1.add(12.5f);
			list1.add(16.5f);
			list1.add(18.4f);
			System.out.println(list1);
			System.out.println(list.get(4));
			System.out.println(list.set(2, 10));
			System.out.println(list.remove(0));
			System.out.println(list);

		}

	}

