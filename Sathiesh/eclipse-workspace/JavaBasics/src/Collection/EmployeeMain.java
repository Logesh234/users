package Collection;

import java.util.ArrayList;
import java.util.Collections;

public class EmployeeMain {

    public static void main(String[] args) {
        Employee emp=new Employee(1003,"gayathri",67999);
        Employee emp1=new Employee(1001,"anand",58999);
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
        Collections.sort(list);
        for(Employee e:list)
        {
            System.out.println(e);
        }
        }


}