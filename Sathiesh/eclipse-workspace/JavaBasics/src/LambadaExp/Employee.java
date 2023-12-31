package LambadaExp;

	public class Employee implements Comparable<Employee>
	{
	    int id;
	    String name;
	    double salary;

	    public Employee()
	    {
	        
	    }
	    
	    public int getId() {
	        return id;
	    }

	    public void setId(int id) {
	        this.id = id;
	    }

	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public double getSalary() {
	        return salary;
	    }

	    public void setSalary(double salary) {
	        this.salary = salary;
	    }

	    public Employee(int id, String name, double salary) {
	        super();
	        this.id = id;
	        this.name = name;
	        this.salary = salary;
	    }

	    double annualsalary()
	    {
	        double annualsalary=salary*12.0;
	        return annualsalary;
	    }
	    double PF()
	    {
	        double pf=(salary*18.0)/100;
	        return pf;
	    }

	    @Override
	    public String toString() {
	        return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", annualsalary()=" + annualsalary()
	                + ", PF()=" + PF() + "]";
	    }
 
	    public int compareTo(Employee that) {
	    	
			if(this.getSalary()> that.getSalary())
				return 1;
			else
				return -1;

	}
	}

