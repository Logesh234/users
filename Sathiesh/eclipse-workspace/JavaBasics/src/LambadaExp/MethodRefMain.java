package LambadaExp;

public class MethodRefMain {

	public static void main(String[] args) 
	{
		
			Example e=new Example();
			//e.myMethod();
			MyInterface ref = e::myMethod;  
			// Calling the method of functional interface  
			ref.display();  

		}

	}

