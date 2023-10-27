package Collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;



public class ProductMain {

	public static void main(String[] args) {
		Product p1=new Product (1001,"chair",12,2000.0f);
		System.out.println(p1);
		Product p2=new Product(1002,"kidschair",20,1500.0f);
		System.out.println(p2);
		Product p3=new Product(1003,"swing",13,2500.0f);
		System.out.println(p3);
		Product p4=new Product(1004,"Tablemate",23,1200.0f);
		ArrayList<Product>list=new ArrayList<Product>();
		list.add(p1);
		list.add(p2);
		list.add(p3);
		list.add(p3);
		list.add(p4);
		System.out.println(list);
		
//		HashSet<Product>set=new HashSet<Product>();
//		set.add(p1);
//		set.add(p2);
//		set.add(p3);
//		set.add(p4);
//		for(Product p:set)
//		{
//			System.out.println(p);
//		}
//		
//		for(Product p:set)
//		{
//			System.out.println(p);
//		}
	}
	
		}
		
	


