package Comparator;


	import java.util.Comparator;

	public class NameSort implements Comparator<Employee>
	{

	    public int compare(Employee o1, Employee o2) {
	        // TODO Auto-generated method stub
	        return o1.getName().compareTo(o2.getName());
	    }

	}


