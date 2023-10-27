package Comparator;

	import java.util.ArrayList;
	import java.util.Collections;
	import java.util.Iterator;
	import java.util.Scanner;

	public class EmployeeMain {

	    public static void main(String[] args) {
	        Employee emp=new Employee(1003,"gayathri",67999);
	        Employee emp1=new Employee(1001,"anand",98999);
	        Employee emp2=new Employee(1002,"sethupathy",90000);
	        ArrayList<Employee>list=new ArrayList<Employee>();
	        list.add(emp);
	        list.add(emp1);
	        list.add(emp2);
	        System.out.println(list);
	        emp.setName("hari");
	        
	        System.out.println("==========================");
	        for(Employee e:list)
	        {
	            System.out.println(e);
	        }
	        System.out.println("==========================");
	        Scanner sc=new Scanner(System.in);
	        System.out.println("enter the choice");
	        int choice =sc.nextInt();
	        if(choice==1)
	        {
	        NameSort n=new NameSort();
	        Collections.sort(list,n);
	        }
	        else if(choice==0)
	        {
	            SalarySort s=new SalarySort();
	            Collections.sort(list,s);
	    
	        }
	        for(Employee e:list)
	        {
	            System.out.println(e);
	        }
	        System.out.println("==========================");

	        Iterator<Employee>it=list.iterator();
	        while(it.hasNext())
	        {
	            System.out.println(it.next());
	        }
	        }


	}


