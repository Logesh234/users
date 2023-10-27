package Thread;

public class DemoExample extends Thread
{
	public void run()//run 
	{
		System.out.println("hai");
	}

	public static void main(String[] args) {
		DemoExample d=new DemoExample();//created
		d.start();//started

	}

}
	
