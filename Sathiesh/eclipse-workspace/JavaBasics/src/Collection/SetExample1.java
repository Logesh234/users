package Collection;


	import java.util.HashSet;
	import java.util.LinkedHashSet;

	public class SetExample1 {

		public static void main(String[] args) {
			LinkedHashSet<Integer> set=new LinkedHashSet<Integer>();
			set.add(12);
			set.add(89);
			set.add(13);
			set.add(14);
			set.add(15);
			set.add(12);
			System.out.println(set);
		}

	}


