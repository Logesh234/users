package Collection;
import java.util.HashSet;
public class SetExample {


		public static void main(String[] args) {
			HashSet<Integer> set=new HashSet<Integer>();
			set.add(12);
			set.add(89);
			set.add(13);
			set.add(14);
			set.add(15);
			set.add(12);
			System.out.println(set);
		}

	}

