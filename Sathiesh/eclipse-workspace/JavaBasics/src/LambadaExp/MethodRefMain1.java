package LambadaExp;

public class MethodRefMain1 {

		public static void main(String[] args) {
			//Example e=new Example();
			//e.myMethod();
			MyInterface ref = Example1::myMethod;  
			// Calling the method of functional interface  
			ref.display();  

		}

	}
