package Oops;

public class BillMain {

	public static void main(String[] args) {
		Bill b=new Bill(12344,45,89);
		System.out.println(b);
		Bill b1=new Bill();
		b1.setBillno(97777);
		b1.setCostperunit(33);
		System.out.println(b1.getBillno());
		System.out.println(b1.getCostperunit());
		

	}

}
