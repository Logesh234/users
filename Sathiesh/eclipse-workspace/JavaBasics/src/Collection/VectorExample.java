package Collection;
import java.util.Vector;
public class VectorExample {

			public static void main(String[] args) {
				Vector<Integer>v=new Vector<Integer>();
				v.add(12);
				v.add(13);
				v.add(67);
				v.add(77);
				System.out.println(v);
				v.set(2, 77);
				v.remove(0);
				System.out.println(v);

			}

		}

