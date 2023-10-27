package Collection;


	import java.util.ArrayList;
	import java.util.Collections;

	public class ListExampleMain {

		public static void main(String[] args) {
			ArrayList <Integer>list=new ArrayList<Integer>();
			list.add(12);
			list.add(13);
			list.add(14);
			list.add(12);
			list.add(16);
			list.add(18);
			list.add(23);
			System.out.println(list);
			Collections.sort(list);
			System.out.println(list);
		  //list.add(0, null);

		}

	}
