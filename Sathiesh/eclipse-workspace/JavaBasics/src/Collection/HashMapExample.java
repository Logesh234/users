package Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;
public class HashMapExample {


		public static void main(String[] args) {
			TreeMap<Integer,String> h=new TreeMap<Integer,String>();
			h.put(3, "three");
			h.put(2, "two");
			h.put(3, "three");
			h.put(4, "one");
			h.put(5, "five");
			h.put(6, "six");
			h.put(7, "seven");
			System.out.println(h);

		}

	}
