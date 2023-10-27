package Inheritance;

public class Programmer extends Employee
{
	private int salary;
	public Programmer()
	{
		
	}
	public Programmer(int id,String ename,int salary) {
		super(id,ename);
		this.salary = salary;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return super.toString()+"Programmer [salary=" + salary + "]";
	}
	
	

}


