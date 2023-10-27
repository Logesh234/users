package Collection;

public class Order
{
	private int orderid;
	private int nooforders;
	private int availablestock;
	public Order()
	{
		
	}
	public Order(int orderid, int nooforders, int availablestock) {
		super();
		this.orderid = orderid;
		this.nooforders = nooforders;
		this.availablestock = availablestock;
	}
	public int getOrderid() {
		return orderid;
	}
	public void setOrderid(int orderid) {
		this.orderid = orderid;
	}
	public int getNooforders() {
		return nooforders;
	}
	public void setNoofunit(int nooforders) {
		this.nooforders = nooforders;
	}
	public int getavailablestock() {
		return availablestock;
	}
	public void setavailablestock(int availablestock) {
		this.availablestock = availablestock;
	}
	
	@Override
	public String toString() {
		return "order [orderid=" + orderid + ", nooforders=" + nooforders + ", availablestock=" + availablestock + "]";
	}
	
	

}

