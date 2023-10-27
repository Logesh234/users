package Collection;
import java.util.ArrayList;
import java.util.Collections;
public class ClassAMain {

	public static void main(String[] args) {
		
		ClassA c=new ClassA ("Sathish",21,95);
		ClassA c1=new ClassA ("Anand",18,80);
		ClassA c2=new ClassA ("Kishore",19,100);
		ArrayList<ClassA>list=new ArrayList<ClassA>();
		list.add(c);
		list.add(c1);
		list.add(c2);
		
		for(ClassA e:list)
		{
			System.out.println(e);
			
		}
		
		System.out.println("============================================");
		
		
		Collections.sort(list);
		for(ClassA e:list)
		{
			System.out.println(e);
		}
		
			}
			}
		


