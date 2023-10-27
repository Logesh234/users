package LambadaExp;


	import java.util.ArrayList;
	import java.util.List;
import java.util.stream.Collectors;

	public class StreamMapExample {

		public static void main(String[] args) {
			List<String> memberNames = new ArrayList<>();
			memberNames.add("Amitabh");
			memberNames.add("Shekhar");
			memberNames.add("Aman");
			memberNames.add("Rahul");
			memberNames.add("Shahrukh");
			memberNames.add("Salman");
			memberNames.add("Yana");
			memberNames.add("Lokesh");
			System.out.println(memberNames);
			System.out.println("===================================");
			memberNames.stream().filter((s) -> s.startsWith("A"))
	        .forEach(System.out::println);
			System.out.println("===================================");
			memberNames.stream().filter((s) -> s.startsWith("A"))
	        .map(String::toUpperCase)
	        .forEach(System.out::println);
			memberNames.stream().sorted()
	        .map(String::toUpperCase)
	        .forEach(System.out::println);
			System.out.println("=====================");
			
	        
	        
	        
	     
	        List<String> memberNames1 = new ArrayList<>();
	        		memberNames1.add("Amitabh");
	        		memberNames1.add("Shekhar");
	        		memberNames1.add("Aman");
	        		memberNames1.add("Rahul");
	        		memberNames1.add("Shahrukh");
	        		memberNames1.add("Salman");
	        		memberNames1.add("Yana");
	        		memberNames1.add("Lokesh");
	        		System.out.println(memberNames1);
	        		System.out.println("===================================");
	        		memberNames1.stream().filter((s) -> s.startsWith("A"))
	                .forEach(System.out::println);
	        		System.out.println("===================================");
	        		memberNames1.stream().filter((s) -> s.startsWith("A"))
	                .map(String::toUpperCase)
	                .forEach(System.out::println);
	        		System.out.println("=====================");
	        		memberNames1.stream().sorted()
	                .map(String::toUpperCase)
	                .forEach(System.out::println);
	        System.out.println("=====================");
	        		List<String> memNamesInUppercase = memberNames1.stream().sorted()
	                        .map(String::toUpperCase)
	                        .collect(Collectors.toList());

	                System.out.print(memNamesInUppercase);
	        System.out.println("=====================================");
	                boolean matchedResult = memberNames1.stream()
	                        .noneMatch((s) -> s.startsWith("A"));
	                 
	                System.out.println(matchedResult);     

	        System.out.println(memberNames1);

	        	}


		}

	
