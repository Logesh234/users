package Collection;

	import java.util.Collections;
	
import java.util.TreeMap;
	import java.util.Iterator;
	import java.util.Map.Entry;

	public class OrderMain {

		public static void main(String[] args) {
			Order o1=new Order(1006,89,12);
			Order o2=new Order(1002,99,13);
			Order o3=new Order(1003,109,142);
			TreeMap<Integer,Order>map=new TreeMap<Integer,Order>();
			map.put(o1.getOrderid(),o1);
			map.put(o2.getOrderid(),o2);
			map.put(o3.getOrderid(),o3);
			Iterator<Entry<Integer, Order>> it=map.entrySet().iterator();
			while(it.hasNext())
			{
				System.out.println(it.next());
			}
		}

	}
