package incrementapproach;

public class Numbers 
{
	private int number1;
	private int number2;
	private String calwanted;
	public Numbers(int number1, int number2, String calwanted) 
	{
		super();
		this.number1 = number1;
		this.number2 = number2;
		this.calwanted = calwanted;
	}
	public int getNumber1() {
		return number1;
	}
	public void setNumber1(int number1) {
		this.number1 = number1;
	}
	public int getNumber2() {
		return number2;
	}
	public void setNumber2(int number2) {
		this.number2 = number2;
	}
	public String getCalwanted() {
		return calwanted;
	}
	public void setCalwanted(String calwanted) {
		this.calwanted = calwanted;
	}
	

}
