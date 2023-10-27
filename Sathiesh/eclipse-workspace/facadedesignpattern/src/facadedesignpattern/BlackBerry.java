package facadedesignpattern;

public class BlackBerry implements MobileShop
{
	@Override
	public void modelNo() 
	{
	System.out.println("Blackberry ");		
	}

	@Override
	public void price() {
		System.out.println("550000");
		
	}
}
