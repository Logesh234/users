package Abstraction;

public class EBill implements Wbill
{
	private int noofunits;
	private int costperunit;
	
	public EBill()
	{
		
	}

	public EBill(int noofunits, int costperunit) {
		super();
		this.noofunits = noofunits;
		this.costperunit = costperunit;
	}

	public int getNoofunits() {
		return noofunits;
	}

	public void setNoofunits(int noofunits) {
		this.noofunits = noofunits;
	}

	public int getCostperunit() {
		return costperunit;
	}

	public void setCostperunit(int costperunit) {
		this.costperunit = costperunit;
	}

	public double calculateBill() {
		return noofunits*costperunit;
	}

	public void display() {
		System.out.println(calculateBill());
		
	}

	@Override
	public String toString() {
		return "EBill [noofunits=" + noofunits + ", costperunit=" + costperunit + ", calculateBill()=" + calculateBill()
				+ "]";
	
	}

	public void nooflitre() {
		// TODO Auto-generated method stub
		
	}

	public void costperlite() {
		// TODO Auto-generated method stub
		
	}
}
