package Mockitoimp;

import org.junit.runner.JUnitCore;
import org.junit.runner.notification.Failure;

public class MainDemo {

	public static void main(String[] args) 
	{
				org.junit.runner.Result result = JUnitCore.runClasses(MainAppTest.class);
			      
			      for (Failure failure : result.getFailures()) {
			         System.out.println(failure.toString());
			      }
			      
			      System.out.println(result.wasSuccessful());


			}

		}
		