package Collection;

import java.util.ArrayList;

import Oops.Bill;

public class BillMain {

	public static void main(String[] args) {
		Bill b=new Bill(12344,45,89);
		System.out.println(b);
		Bill b1=new Bill();
		b1.setBillno(97777);
		b1.setCostperunit(33);
		ArrayList<Bill>list=new ArrayList<Bill>();
		list.add(b);
		list.add(b1);
		System.out.println(list);
		
		System.out.println(list);
		System.out.println("==========================");
		for(int i=0;i<list.size();i++)
		{
			System.out.println(list.get(i));
		}
		System.out.println("==========================");
		for(Bill b11:list)
		{
			System.out.println(b11);
		}
		}


}
		

	
