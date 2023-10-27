package LambadaExp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListExample {

	public static void main(String[] args) {
		List<Integer>list= Arrays.asList(12,13,15,17,19);
		
		System.out.println(list);
		System.out.println("=======================");
	  for(Integer i:list)
	  {
		  System.out.println(i);
	  }
     list.forEach(x->System.out.println(x));
	
	
	 list.forEach(x->
     {
    	x+=2;
    	System.out.println(x);
     });
	}
}



