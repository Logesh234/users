package Abstraction;

public class WBill implements Bill{
	private int noofliters;
	private int costperliter;
	
	public WBill() {
		
	}

	public WBill(int noofliters, int costperliter) {
		super();
		this.noofliters = noofliters;
		this.costperliter = costperliter;
	}

	public int getNoofliters() {
		return noofliters;
	}

	public void setNooflilter(int noofliters) {
		this.noofliters = noofliters;
	}

	public int getCostperliter() {
		return costperliter;
	}

	public void setCostperliter(int costperliter) {
		this.costperliter = costperliter;
	}

	@Override
	public double calculateBill() {
		// TODO Auto-generated method stub
		return noofliters*costperliter;
	}

	@Override
	public void display() {
		System.out.println(calculateBill());
		
	}

	@Override
	public String toString() {
		return "WBill [noofliters=" + noofliters + ", costperliter=" + costperliter + ", calculateBill()="
				+ calculateBill() + "]";
	}
	
	
	
	
}