package Strings;

public class Buffer {

	public static void main(String[] args) {
		StringBuffer s=new StringBuffer("HelloWorld");
		System.out.println(s);
		s.append("hai");
		System.out.println(s);
		s.reverse();
		System.out.println(s);
		s.insert(0, "world");
		System.out.println(s);
		s.replace(0, 3, "ttt");
		System.out.println(s);
		s.delete(0, 3);
		System.out.println(s);
		
		

	}

}
