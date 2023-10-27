package Strings;

public class StringMethod {

	public static void main(String[] args) {
		String s="hello";
		String s1="HELLO";

		System.out.println(s.charAt(3));
		System.out.println(s.indexOf('h'));
		System.out.println(s.toLowerCase());
		System.out.println(s.toUpperCase());
		System.out.println(s.concat("hai"));
		System.out.println(s.equals(s1));
		System.out.println(s.equalsIgnoreCase(s1));
		System.out.println(s.trim());
		System.out.println(s.contains("h"));
		System.out.println(s.isEmpty());
		System.out.println(s.length());
		System.out.println(s.substring(0,3));
		System.out.println(s.replace("llo", "world"));
		
		
	}
	

}

