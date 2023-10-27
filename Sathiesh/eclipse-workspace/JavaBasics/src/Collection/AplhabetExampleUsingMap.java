package Collection;
import java.util.ArrayList;
	import java.util.HashMap;
	import java.util.List;
	import java.util.Map.Entry;
	import java.util.Scanner;
public class AplhabetExampleUsingMap {
	public static void main(String[] args) {
			Scanner scanner=new Scanner(System.in);
			//char alphabet=sc.next().charAt(0);
			HashMap<Character,List<String>>map=new HashMap<Character,List<String>>();
			ArrayList<String> list1=new ArrayList<String>();
			list1.add("Apple");
			list1.add("ant");
			list1.add("aeroplane");
			ArrayList<String> list2=new ArrayList<String>();
			list2.add("Banana");
			list2.add("Balloon");
			list2.add("Bag");
			ArrayList<String> list3=new ArrayList<String>();
			list3.add("Car");
			list3.add("Cap");
			list3.add("cow");
			map.put('A', list1);
			map.put('B', list2);
			map.put('C', list3);
			for(Entry<Character, List<String>> m:map.entrySet())
			{
				System.out.println(m.getKey());
				System.out.println(m.getValue());
			}
			
		}

}